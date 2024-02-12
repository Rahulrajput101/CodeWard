package stack;

import java.util.Stack;

public class StockSpan {

    public  void stockSpanMain() {
        int[] stocks = {100, 80, 60, 70, 60, 85, 110};
        int[] span = new int[stocks.length];
        getStocksSpan(stocks, span);

        for ( int  i  =0 ; i<span.length; i++){
            System.out.println(span[i]);
        }
    }
    private void getStocksSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0]  = 1;
        s.push(0);
        for( int i = 1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while( !s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i - s.peek();
            }

            s.push(i);

        }
    }
}



