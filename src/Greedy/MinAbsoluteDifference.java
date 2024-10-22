package Greedy;

import java.util.Arrays;

public class MinAbsoluteDifference {

    public static void main(String[] args) {
        int a[] = {4, 1, 8, 7};
        int b[] = {2, 3, 6, 5};

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += Math.abs(a[i] - b[i]);
        }

        System.out.println(sum);
    }

}
