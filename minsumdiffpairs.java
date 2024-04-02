import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;
public class minsumdiffpairs {
    public static void main(String arsg[]){
        int A[]={4,2,3};
        int B[]={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int mins=0;
        for(int i=0;i<A.length;i++){
           mins=mins+(Math.abs(A[i]-B[i]));
        }
        System.out.println("minimum sum absolute differnce is "+ mins);
    }
}
