import java.util.*;
public class knapsack {
    public static void main(String args[]){
        int val[]={1000,1500,2000};
        int w[]={2,2,2};
        int v=0;
        int weight=5;
        double arr[][]=new double[val.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=i;
            arr[i][1]=val[i]/(double)w[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));

        for(int i=arr.length-1;i>=0;i--){
            int idx=(int)arr[i][0];
            if(weight>=w[idx]){
                weight=weight-w[idx];
                v=v+val[idx];
            }
            else{
                v=v+weight*(int)arr[i][1];
            }
        }
        System.out.println("max value that can be stored is " + v);
    }
}
