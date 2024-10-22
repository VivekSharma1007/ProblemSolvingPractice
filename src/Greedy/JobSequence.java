package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobSequence {

    public static class Job {
        int idx;
        int profit;
        int deadline;

        Job(int idx, int profit, int deadline) {
            this.idx = idx;
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 30}, {1, 40}, {1, 10}};

        List<Job> list = new ArrayList<>();

        // storing job data in list
        for(int i = 0; i < jobInfo.length; i++) {
            list.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }

        // sort on the basis of profit in descending order
        Collections.sort(list, (a,b) -> b.profit - a.profit);  // what if two jobs have same profit but diff deadline, \
        // then we must double sort on the basis of deadline too
//        Collections.sort(list, (a, b) -> {
//            int val = b.profit - a.profit;
//            if(val == 0) // two or more have same value of profit
//            {
//               val = a.deadline - b.deadline;
//            }
//            return val;
//        });

        int maxProfit = 0;
        int time = 0;
        List<Job> ans = new ArrayList<>();
        for(Job job : list) {
            if(time < job.deadline) {
                ans.add(job);
                maxProfit += job.profit;
                time++;
            }
        }

        System.out.println(maxProfit);

        for(Job n : ans) {
            System.out.println(n.idx);
        }
    }
}
