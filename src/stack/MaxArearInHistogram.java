package stack;

import java.util.Stack;

public class MaxArearInHistogram {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];
        Stack <Integer> s = new Stack<>();

        //next smallest right
        for(int i = heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s.clear();

        // next smallest left
        for(int i = 0; i<heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        //find the largest area

        for(int i = 0; i<heights.length; i++){
            int height = heights[i];
            int width = nsr[i] -nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea , maxArea);
        }

        return maxArea;
    }
}
