package Stacks;

import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {

        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
