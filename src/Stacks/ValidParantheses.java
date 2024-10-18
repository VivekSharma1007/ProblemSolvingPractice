package Stacks;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str = "({[]}))";

        Stack<Character> s = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else if(ch == ')' || ch == ']' || ch == '}') {
                if(s.isEmpty() || !checkMatch(ch, s.peek())) {
                    flag = false;
                    break;
                }
                s.pop();
            }
        }

        if(!s.isEmpty()) {
            flag = false;
        }

        System.out.println(flag);
    }

    public static boolean checkMatch(Character ch, Character stackTop) {
        if(ch == ')' && stackTop == '(') {
            return true;
        } else if(ch == ']' && stackTop == '[') {
            return true;
        } else if(ch == '}' && stackTop == '{') {
            return true;
        }
        return false;
    }
}
