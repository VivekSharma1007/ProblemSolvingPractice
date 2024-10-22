package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // case 1: when end array is sorted
        // it means the very first activity will take less time and will be completed first.. bcz it is the smallest values
        // as this is sorted

        List<Integer> activities = new ArrayList<>();
        int activityCount = 0;

        // here we are choosing first activity so
        activityCount = 1;
        activities.add(0);

        int lastEnd = end[0];

        for(int i = 1; i < start.length; i++) {
            // check if start of next activity do not overlap with last activity end
            if(lastEnd <= start[i]) {
                // will perform activity
                activityCount++;
                activities.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(activityCount);

        for(int n : activities) {
            System.out.println("A" + n);
        }


        // case 2: when end array is not sorted
        // then we have to sort that array
        double array[][] = new double[end.length][3];

        // col - 0: original index
        // col - 1: start
        // col - 2: end

        for(int i = 0; i < array.length; i++) {
            array[i][0] = i;
            array[i][1] = start[i];
            array[i][2] = end[i];
        }

        Arrays.sort(array, Comparator.comparingDouble(o -> o[2])); // will sort on the basis of column

        case2(array);
    }

    public static void case2(double [][]array) {
        List<Double> list = new ArrayList<>();
        int count = 0;
        list.add(array[0][0]);
        count = 1;
        double lastEnd = array[0][2];
        for(int i = 1; i < array.length; i++) {
            if(array[i][1] >= lastEnd) {
                list.add(array[i][0]); // storing the index
                count++;
                lastEnd = array[i][2];
            }
        }
        System.out.println(count);

        for(double n : list) {
            System.out.println(n);
        }
    }

}
