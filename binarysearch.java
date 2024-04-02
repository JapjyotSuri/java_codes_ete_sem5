public class binarysearch {
    public static void binarysearch(int arr[],int k){
int s=0;
int e=arr.length-1;

boolean a=false;
while(s<=e){
    int mid=(s+e)/2;
    if(arr[mid]==k){
       a=true;
       break;
    }
    else if(arr[mid]>k){
        e=mid-1;
    }
    else{
        s=mid+1;
    }
}
if(a){
    System.out.println("found");
}
else{
    System.out.println("not found");
}
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7};
        int key=6;
        binarysearch(arr,key);
    }
}
