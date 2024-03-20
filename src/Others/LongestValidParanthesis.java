package Others;

import java.util.Stack;

public class LongestValidParanthesis {
    public int longestValidParenthesesMain(String s) {
        Stack <Integer> stack = new Stack<>();
        stack.push(-1);
        int max =0;
        Character c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max = Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
}
