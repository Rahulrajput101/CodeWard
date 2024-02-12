package stack;

import java.util.Stack;

public class NextGreaterElement {

    public void nextGreaterElementMain(){
        int [] arr = {6,8,0,1,3};
        Stack<Integer> stack = new Stack<>();
        int [] gArr = new int[arr.length];

        for (int i = arr.length-1; i>=0; i--){
            while (!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
             stack.pop();
            }

            if(stack.isEmpty()){
                gArr[i] = -1;
            }else{
                gArr[i] = arr[stack.peek()];
            }

            stack.push(i);
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(gArr[i]);
        }

    }
}
