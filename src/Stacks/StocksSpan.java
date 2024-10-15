package Stacks;

import java.util.Stack;

public class StocksSpan {

    public static void stockSpan(int stocks[]) {
        int span[] = new int[stocks.length];
        Stack<Integer> s = new Stack<>();
        // span = idx - prevHigh
        // stack - prev highs ka indx
        s.push(0);
        span[0] = 1;

        for(int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];
            while(!s.isEmpty() && stocks[s.peek()] <= currentPrice) {
                s.pop();
            }

            if(s.isEmpty()) {
                span[i] = i + 1;  // isse pehle koi nhi tha high
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }

        for(int n : span) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 75, 85, 100};

        stockSpan(stocks);
    }
}
