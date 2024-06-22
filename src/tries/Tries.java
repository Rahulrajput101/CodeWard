package tries;

public class Tries {

    static class Node{

        Node [] children = new Node[26];
        boolean eow = false;


        Node(){
//            for (Node child : children){
//                 child = null;
//            }

            for (int i =0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level =0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int count( Node root){

        if (root == null){
            return 0;
        }
        int count = 0;
        for (int  i =0; i<26; i++){
            if (root.children[i] != null){
              count += count(root.children[i]);
            }
        }
        return count+1;
    }


    public static void  longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }

        for (int i = 0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow){
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > LongestWordWithAllPrefixes.ans.length()){
                    LongestWordWithAllPrefixes.ans = temp.toString();
                }
                longestWord(root.children[i],temp);
                //backTrack
                System.out.println("backtrack startes at " +(char) (i+'a'));
                temp.deleteCharAt(temp.length()-1);
            }
        }
        System.out.println("complete of bc");
    }

//    public static void print(){
//        Node curr = root;
//        for (Node node : curr.children){
//            System.out.println(node.children[]);
//        }
//    }

    public static boolean search( String word){   //0(L)
        Node curr = root;
        for (int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null){
                return false;
            }
         curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean startsWith(String word){
        Node curr = root;
        for (int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) -'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args){
        String [] word = {"the","a","three", "their","any","thee"};
        for (int i = 0; i< word.length; i++){
            insert(word[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}
