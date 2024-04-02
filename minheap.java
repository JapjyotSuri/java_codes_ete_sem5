import java.util.*;

public class minheap{
    public static void main(String args[]){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.offer(sc.nextInt());
        }
        Object[] arr=queue.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}