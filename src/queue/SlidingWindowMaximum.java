package queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {//nLogK
    public int[] slidingWindowMaxMain(int[] arr, int k){

        Deque <Integer> deque = new LinkedList<>();
        int[] result = new int[arr.length - k + 1];
        int idx = 0;

        for(int i = 0; i<k; i++){

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }


        for( int i = k; i<arr.length; i++){
            result[idx++] = arr[deque.peekFirst()];

             while (!deque.isEmpty() && deque.peek() <= i-k){
                 deque.removeFirst();
             }

             while (!deque.isEmpty() && arr[deque.peek()] <= arr[i]){
                 deque.removeLast();
             }
            deque.addLast(i);
        }
        result[idx] = arr[deque.peekFirst()];

        return result;
    }
}
