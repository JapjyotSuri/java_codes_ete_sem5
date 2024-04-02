public class split {
    public static void main(String args[]){
        String str="my name is jap";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        StringBuilder s=new StringBuilder(str);
        s.reverse();
       
        String result=s.toString();
        System.out.println(result);
    }
}
