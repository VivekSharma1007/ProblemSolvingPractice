package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocoProblem {
    public static void main(String[] args) {
        Integer vertical[] = {2, 1, 3, 1, 4};
        Integer horizontal[] = {4, 1, 2};

        Arrays.sort(vertical, Collections.reverseOrder());
        Arrays.sort(horizontal, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;

        while(h < horizontal.length && v < vertical.length) {
            if(vertical[v] >= horizontal[h]) {
                cost += (vertical[v] * hp);
                vp++;
                v++;
            } else {
                cost += (horizontal[h] * vp);
                hp++;
                h++;
            }
        }

        while(h < horizontal.length) {
            cost += (horizontal[h] * vp);
            hp++;
            h++;
        }

        while(v < vertical.length) {
            cost += (vertical[v] * hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
