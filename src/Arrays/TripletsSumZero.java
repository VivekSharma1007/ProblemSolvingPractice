package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TripletsSumZero {

    public static void tripletsSum(int arr[]) {
        if(arr.length < 3) {
            return;
        }

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int n : arr) {
            if(!list.contains(n)) {
                list.add(n);
            }
        }

        System.out.println(list);

        for(int i = 0; i < list.size() - 2; i++) {
            for(int j = i + 1; j < list.size() - 1; j++) {
                for(int k = j + 1; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == 0) {
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};

        tripletsSum(arr);
    }
}
