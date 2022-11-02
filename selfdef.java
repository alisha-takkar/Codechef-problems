import java.util.Scanner;

public class selfdef{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

         int T = s.nextInt();
         if(T<1 || T > 20){
            System.exit(0);
         }

        
         int sum =0 ;
         int j;

         for(int i=0; i<T ; i++){
            int N = s.nextInt();
            if(N<1 || N>100){
                System.exit(0);
            }

            int A[] = new int[N] ;  

            for(j =0 ; j<=N ; j++){
                A[j]  = s.nextInt();  
                if(A[j] > 100){System.exit(0);}     
            }

            if(A[j] >= 10 || A[j] <= 60){
                sum += 1;
            }

            System.out.println(sum);
         }
    }
}