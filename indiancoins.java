import java.util.*;
public class indiancoins {
    public static void main(String args[]){
        int curr[]={1,2,5,10,20,50,100,500,2000};
        int v=590;
        int cnt=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=curr.length-1;i>=0;i--){
            if(v>=curr[i]){
                while(curr[i]<=v){
                v=v-curr[i];
                a.add(curr[i]);
                cnt++;
                }
            }
            if(v==0){
                break;
            }
        }
        System.out.println("the no of denominations = "+ cnt);
        System.out.println("the denominations are " + a);
    }
}
