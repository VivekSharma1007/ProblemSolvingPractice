package Queuess;

import java.util.LinkedList;
import java.util.Queue;

public class FirstOccurence {

    public static void firstNonRepeatingOcc(String str) {

        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a'] = freq[ch - 'a'] + 1; // updating the freq of current character
            q.add(ch);

            while(!q.isEmpty()) {
                if(freq[q.peek() - 'a'] == 1) {
                    System.out.print(q.peek() + " ");
                    break;
                }
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print("-1 ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeatingOcc(str);
    }
}
