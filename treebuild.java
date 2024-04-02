import java.util.*;
public class treebuild {
   
     public static void buildtree(int arr[][]){
       idx++;
       Queue<Integer> q=new
     }
     static int idx=-1;
     static int level=0;
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    buildtree(arr);
    }
}
