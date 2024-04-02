import java.util.*;
public class fractionalknapsac {
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[val.length][2];//2d array made to map ratio with their orignal idx so we can use it after sorting
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];//typecast any one of the 2 so that the final value of ratio can be in decimal

        }
        int capacity=W;
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));//sorting in ascending order with respect to ratio value
        int totalval=0;
    for(int i=ratio.length-1;i>=0;i--){//opposite loop as sorted in ascending order
        int idx=(int)ratio[i][0];
        if(capacity>=weight[idx]){//if capacity is greater than weight add whole value to total value and subtract weight from capacity
           capacity=capacity-weight[idx];
           totalval=totalval+val[idx];
        }
        else{//if capacity is less than weight then multiply remaining capacity with the ratio and add it to totalval and make capacity 0 
            totalval=totalval+capacity*(int)(ratio[i][1]);
            capacity=0;
            break;
        }
    }
    System.out.println("Total value="+totalval);
    }
}
