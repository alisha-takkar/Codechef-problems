/*  Problem :
    Three numbers A, B and C are the inputs. Write a program to find second largest among them.

    Input Format :
    The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

    Output Format :
    For each test case, display the second largest among A, B and C, in a new line.

    Constraints:
    1 ≤ T ≤ 1000
    1 ≤ A,B,C ≤ 1000000

    Sample 1:

    Input                            Output
    3                                120
    120 11 400                       312
    10213 312 10                     10
    10 3 450
*/

import java.util.Scanner;

public class flow017{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T<1 || T>1000){
            System.exit(0);
        } 

        for(int i=0;i<T; i++){
            int A= s.nextInt();
            if(A<1 || A>1000000){
                System.exit(0);
            }

            int B= s.nextInt();
            if(B<1 || B>1000000){
                System.exit(0);
            }

            int C= s.nextInt();
            if(C<1 || C>1000000){
                System.exit(0);
            }

            int max=A;
            if((A>B && C<B) || (B<C && B>A)){
                max=B;
            }
            else if((C>B && C<A)||(C<B && C>A)){
            max=C;
            }

            System.out.println(max);
        }
    }
}