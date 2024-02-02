package stack;

import java.util.Stack;

public class PushAtTheBottomOFStack {

    public void stack(){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushElementInLast( s, 4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    private void PushElementInLast(Stack<Integer> s, int i) {

        if(s.isEmpty()){
            s.push(i);
            return;
        }
        int top = s.pop();
        PushElementInLast(s,i);
        s.push(top);

    }
}
