package Arrays.arraylists;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 17;

        int lp = 0, rp = list.size() - 1;
        for(int i = 0, j = 1; i < list.size(); i++, j++) {
            if(list.get(j) < list.get(i)) {
                lp = j;
                rp = i;
                break;
            }
        }

        while(lp != rp) {
            int currentSum = list.get(lp) + list.get(rp);
            if(currentSum == target) {
                System.out.println(list.get(lp) + ", " + list.get(rp));
                break;
            } else if(currentSum < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }


    }
}
