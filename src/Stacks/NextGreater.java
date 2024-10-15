package Stacks;

import java.util.Stack;

public class NextGreater {
    public static void nextGreaterNumber(int arr[]) {
        int nextGreaterArr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        s.push(arr.length - 1);
        nextGreaterArr[nextGreaterArr.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextGreaterArr[i] = -1;
            } else {
                nextGreaterArr[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int n : nextGreaterArr) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};

        nextGreaterNumber(arr);
    }
}
