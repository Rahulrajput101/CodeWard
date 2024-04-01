package greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array of jobs having a specific deadline and associated with a profit,
 * provided the job is completed within the given deadline.
 * The task is to maximize the profit by arranging the jobs in a schedule,
 * such that only one job can be done at a time.
 */
public class JobSequecingWithDeadline {

    static class Job{

        int idx ;
        int deadline;
        int profit;

        public Job( int i, int d,int p){
            idx = i;
            deadline = d;
            profit = p;
        }
    }

    public  void JobSequencingMain(){

        int [][] job = { {4,20},{1,10},{1,20},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        //Adding element
        for (int i = 0; i< job.length; i++){
            jobs.add( new Job(i,job[i][0],job[i][1]));
        }

        //sorting in descending order
        Collections.sort(jobs, ((o1, o2) -> o2.profit - o1.profit));

        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();

        for (int i = 0; i<jobs.size(); i++ ){
            Job currJob = jobs.get(i);
            if(time < currJob.deadline ){
                  seq.add(currJob.idx);
                 time ++;
            }
        }

        System.out.println("max jobs is:" + seq.size());
        for ( int i = 0; i<seq.size(); i++){
            System.out.print(" sequence is :" + seq.get(i));
        }

    }
}
