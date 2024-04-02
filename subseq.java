import java.util.*;
public class subseq {
    static ArrayList<String> a=new ArrayList<>();
    public static void subseq(String s,String ans){
        if(s.length()==0){
           a.add(ans);
           return;
        }
        subseq(s.substring(1),ans + s.charAt(0));
        subseq(s.substring(1),ans);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        subseq(s,"");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i) + " ");
        }
        
    }
}
