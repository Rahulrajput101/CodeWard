package queue;

import java.util.Stack;

public class QueueUsing2Stacks {
    private Stack<Integer> s1 ;
    private Stack<Integer> s2 ;
    public QueueUsing2Stacks() {
        s1 =  new Stack<>();
        s2 = new Stack<>();

    }

    public void push(int x) {
        while(!empty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        if(empty()){
            return -1;
        }
        return s1.pop();
    }

    public int peek() {
        if(empty()){
            return -1;
        }
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

//another way : doing push in 0(1) time
class MyQueue {
    private Stack<Integer> s1 ;
    private Stack<Integer> s2 ;
    public MyQueue() {
        s1 =  new Stack<>();
        s2 = new Stack<>();

    }

    public void push(int x) {

        s1.push(x);


    }

    public int pop() {
        if(empty()){
            return -1;
        }
        while(!empty()){
            s2.push(s1.pop());
        }
        int result =  s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }

    public int peek() {
        if(empty()){
            return -1;
        }
        while(!empty()){
            s2.push(s1.pop());
        }
        int result =  s2.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

