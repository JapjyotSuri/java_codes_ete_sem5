import java.util.*;
public class jobsequencing {
    static class job{
        int deadline;
        int profit;
        int id;
        public job(int i,int d,int p){
        id=i;
        deadline=d;
        profit=p;
        }
    }
    public static void main(String args[]){
        int[][] jobs={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> a=new ArrayList<>();
        for(int i=0;i<jobs.length;i++){
            a.add(new job(i,jobs[i][0],jobs[i][1]));
        }
        ArrayList<Integer> result=new ArrayList<>();
        int time=0;
        Collections.sort(a,(a1,b1) -> b1.profit-a1.profit);//we wrote b first because we need to sort in descending order
        for(int i=0;i<a.size();i++){
            job j=a.get(i);
            if(j.deadline>time){//check if job deadline is greater than time
                time++;//inc time by 1
                result.add(j.id);//add job id in result array
            }
        }
        System.out.println(result + " max no of jobs" + result.size());
    }
}
