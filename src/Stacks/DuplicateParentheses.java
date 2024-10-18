package Stacks;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')' || ch == ']' || ch == '}') {
                if(s.isEmpty()) {
                    return false;
                }
                int counter = 0;
                while(!s.isEmpty()) {
                    if(((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}'))) {
                        s.pop();
                        break;
                    } else {
                        counter++;
                        s.pop();
                    }
                }
                if(counter < 1) {
                    return false;
                }
            } else {
                s.push(ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "((a+b)(c+d))";

        System.out.println(isDuplicate(str));
    }
}
