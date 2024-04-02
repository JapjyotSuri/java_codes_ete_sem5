public class prime {
    public static void main(String args[]){
        //all prime nummbers are in format 6n+1 and 6n-1 but all number made from the two are not prime like 25

        for(int i=1;i<=1000/6;i++){
            boolean b=true;
            int n1=6*i-1;
            for(int j=2;j<n1;j++){
               if(i%j==0){
                  b=false;  
               }
            }
            
            if(b){
                System.out.print(n1 + " ");
            }

        boolean b1=true;
        int n2=6*i+1;
        for(int k=2;k<n2;k++){
            if(i%k==0){
               b1=false;  
            }
         }
         if(b1){
             System.out.print(n2 + " ");
         }
         
     }
    
    }
}
