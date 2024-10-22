package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000};
        int value = 591;

        // sort in descending order
        Arrays.sort(coins, Collections.reverseOrder());

        int count = 0;
        for(int i = 0; i < coins.length; i++) {
            while(value >= coins[i]) {
                count++;
                value = value - coins[i];
            }
        }

        System.out.println(count);
    }
}
