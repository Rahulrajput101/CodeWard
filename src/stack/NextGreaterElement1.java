package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        for (int i = nums2.length-1; i>=0; i--){
            while (!stack.isEmpty() && nums2[stack.peek()]<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreaterMap.put(nums2[i],-1);
            }else{
                nextGreaterMap.put(nums2[i],nums2[stack.peek()]);
            }

            stack.push(i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
