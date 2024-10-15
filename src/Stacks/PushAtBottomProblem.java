package Stacks;

import java.util.Stack;

public class PushAtBottomProblem {

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        // 3 2 1

        pushAtBottom(stack, 4); // 3 2 1 4
        System.out.println(stack);
    }
}
