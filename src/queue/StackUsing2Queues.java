package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public StackUsing2Queues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

    }

    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }else{
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
        }

    }

    public int pop() {
        if(empty()){
            return -1;
        }
        if(!q1.isEmpty()){
            return q1.remove();
        }else{
            return q2.remove();
        }
    }

    public int top() {
        if(empty()){
            return -1;
        }
        if(!q1.isEmpty()){
            return q1.peek();
        }else{
            return q2.peek();
        }
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
