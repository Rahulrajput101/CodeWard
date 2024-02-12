package stack;

import linked_list.Reverse;

import java.util.Stack;

public class ReverseStack  {


    public void reverseStackMain(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
      //  printStack(stack);
        reversingStack(stack);
        printStack(stack);
    }

    private void reversingStack(Stack<Integer> stack) {

        if(stack.isEmpty()){
            return;
        }
        int top  = stack.pop();

        reversingStack(stack);
        pushTheElementInLast(stack , top);
    }

    private void pushTheElementInLast(Stack<Integer> stack, int top) {

        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        int topEll = stack.pop();
        pushTheElementInLast(stack, top);
        stack.push(topEll);
    }

    private void printStack(Stack<Integer> s){
         while (!s.isEmpty()){
             System.out.println(s.pop());
         }
    }
}
