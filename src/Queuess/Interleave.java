package Queuess;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static void main(String[] args) {
        Queue<Integer> givenQ = new LinkedList<>();

        for(int i = 1; i <= 10; i++) {
            givenQ.add(i);
        }

        Queue<Integer> firstQ = new LinkedList<>();
        int givenQSize = givenQ.size();
        for(int i = 0; i < givenQSize/2; i++) {
            firstQ.add(givenQ.remove());
        }

        int idx = 0;
        while(!firstQ.isEmpty()) {
            if(idx % 2 == 0) {
                givenQ.add(firstQ.remove());
            } else {
                givenQ.add(givenQ.remove());
            }
            idx++;
        }

        givenQ.add(givenQ.remove());


        for(int n : givenQ) {
            System.out.print(n + " ");
        }
    }
}
