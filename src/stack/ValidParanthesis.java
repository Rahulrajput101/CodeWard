package stack;

import java.util.Stack;

public class ValidParanthesis {

    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for( int i = 0; i<s.length(); i++){
            if(isOpening(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty() && isPair(stack.peek(),s.charAt(i)) ){
                    stack.pop();
                } else {
                    return false;
                }

            }


        }
        return stack.isEmpty();

    }

    private boolean isOpening(char c){
        if(c == '(' || c == '{' || c == '['){
            return true;
        }
        return false;
    }

    private boolean isPair(char c1, char c2){
        if((c1 =='(' && c2 ==')') || (c1 =='{' && c2 =='}')  || (c1 =='[' && c2 ==']') ){
            return true;
        }
        return false;
    }
}
