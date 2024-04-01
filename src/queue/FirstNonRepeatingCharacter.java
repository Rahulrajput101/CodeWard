package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public void  firstNotRepeatingMain( String s){

        int[] freq = new int[26];

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            q.add(c);
            freq[c - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek()+"");
            }
        }
    }

    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        Queue<Character> q = new  LinkedList<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        while(!q.isEmpty() && freq[q.peek() -'a'] == 1){
            return q.peek()-'a';
        }
        return -1;
    }

}
