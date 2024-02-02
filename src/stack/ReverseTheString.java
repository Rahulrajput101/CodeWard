package stack;

import java.util.Stack;

public class ReverseTheString {

    public void ReverseString(){
        String str = "abc";
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx <= str.length()-1){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!s.isEmpty()){
             stringBuilder.append(s.pop());
        }
        System.out.println(stringBuilder.toString());
    }
}
