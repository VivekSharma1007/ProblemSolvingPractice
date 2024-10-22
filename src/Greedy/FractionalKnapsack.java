package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int capacity = 50;

        int maxValue = 0;
        double ratio[][] = new double[weight.length][2];

        for(int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        // sort -- will sort in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // we will start with the best ratio -- value ++ weight --
        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if(capacity - weight[idx] >= 0) {
                // total weight will be taken
                capacity = capacity - weight[idx];
                maxValue = maxValue + value[idx];
            } else {
                // fraction value
                maxValue = maxValue + (int)(capacity * ratio[i][1]);
                break;
            }
        }

        System.out.println(maxValue);
    }
}
