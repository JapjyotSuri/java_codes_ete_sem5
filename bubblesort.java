public class bubblesort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        for(int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
               if(arr[j]>arr[j+1]){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
               }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
