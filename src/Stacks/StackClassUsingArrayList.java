package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackClassUsingArrayList {

    // using ArrayList
      static class Stack {
        ArrayList<Integer> stack = new ArrayList<>();

        // isEmpty O(1)
        public boolean isEmpty() {
            return stack.size() == 0;
        }

        // push O(1)
        public void push(int data) {
            stack.add(data); // will add at last place only -- follows stacks top element addition
        }

        // pop O(1)
        public int pop() {
            if(stack.isEmpty()) {
                return -1;
            }
            int data = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return data;
        }

        // peek O(1)
        public int peek() {
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
