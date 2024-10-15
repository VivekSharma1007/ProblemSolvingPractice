package Stacks;

import java.util.Stack;

public class StringReverse {
    public static void reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder newString = new StringBuilder();
        while(!stack.isEmpty()) {
            newString.append(stack.pop());
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        reverse(str);
    }
}
