package tries;

import java.util.ArrayList;

import static tries.Tries.insert;

public class PrefixProblem {

    static class Node{
        Node [] children = new Node[26];
        boolean eow = false;
        int freq;

        Node(){
            for (int i = 0; i<26; i++){
                children[i] = null;
            }

            freq = 1;
        }
    }
    public static Node root = new Node();

    public void insert(String key){
        Node curr = root;
        for (int level = 0; level<key.length(); level++){
            int idx = key.charAt(level) -'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else {
                curr.children[idx].freq +=1;
            }
            curr =curr.children[idx];
        }
        curr.eow = true;
    }



    public void prefixMain(){

        String[] arr = {"zebra","dog","dove","duck"};
        for (int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.freq = -1;
       findPrefix(root,"");

    }

    private void findPrefix(Node root ,String ans) {
        if (root == null){
            return;
        }
        if (root.freq == 1){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i<root.children.length; i++){
            if (root.children[i] != null){
                findPrefix(root.children[i],ans+(char)(i+'a') );
            }
        }

    }
}
