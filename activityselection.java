import java.util.*;
//use below code if the end time is already sorted
// maxact=1;
// a.add(0);
// int lastend=end[0];
// for(int i=0;i<end.length;i++){
// if(start[i]>=lastend){//selecting activity that is not overlapping
//     a.add(i);
//     lastend=end[i];
//     maxact++;//increasing the activity performed
// }
// }
// System.out.println(maxact);
// System.out.println(a);
public class activityselection {
    public static void main(String args[]){//time complexcity=O(n)
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,5,6,9,9};

        //sorting process of end 
         int activities[][]=new int[start.length][3];
         for(int i=0;i<start.length;i++){
             activities[i][0]=i;//to store index number of activity
             activities[i][1]=start[i];//to store start time
             activities[i][2]=end[i];//to store end time
         }
         //lamda function->shortform to sort
         Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));//condition being used to sort 2d array on bases of end time
        int maxact=0;
        ArrayList<Integer> a=new ArrayList<>();//to store the activity number or index

        maxact=1;
        a.add(0);
        int lastend=activities[0][2];
        for(int i=0;i<end.length;i++){
        if(activities[i][1]>=lastend){//selecting activity that is not overlapping
            a.add(i);
            lastend=activities[i][2];
            maxact++;//increasing the activity performed
        }
        }
        System.out.println(maxact);
        System.out.println(a);
    }
}
