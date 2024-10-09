package Arrays.arraylists;

import java.util.ArrayList;

public class maxWaterStore {

    public static int maxWater(ArrayList<Integer> list) {
        // 2 pointer way

        int lp = 0;
        int rp = list.size() - 1;
        int max = 0;

        while(lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;

            int currentWaterStored = height * width;
            max = Math.max(max, currentWaterStored);

            if(list.get(lp) < list.get(rp)) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);list.add(2);list.add(5);
        list.add(4);list.add(8);
        list.add(3);
        list.add(7);


        System.out.println(maxWater(list));




    }
}
