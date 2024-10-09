package Arrays.arraylists;

import java.util.ArrayList;

public class PairSum1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            list.add(i);
        }

        int target = 7;
        // 2 pointer approach

        int lp = 0;
        int rp = list.size() - 1;
        while(lp <= rp) {
            int currentSum = list.get(lp) + list.get(rp);
            if(currentSum == target) {
                System.out.println(list.get(lp) + ", " + list.get(rp));
                break;
            } else if(currentSum > target) {
                rp--;
            } else {
                lp++;
            }
        }
    }
}
