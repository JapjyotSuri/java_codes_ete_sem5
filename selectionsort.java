public class selectionsort {
    public static void main(String args[]){
        int arr[]={5,3,6,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int  minpos=i;
            for(int j=i+1;j<n;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
    }
}
