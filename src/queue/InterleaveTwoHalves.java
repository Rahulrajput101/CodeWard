package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalves {

    public void interLeaveTwoHalvesMain(Queue<Integer> q){

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size()/2;

        for(int i = 0; i<size; i++){
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }

}
