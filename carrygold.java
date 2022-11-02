/*  Problem :
    Chef has decided to go to a gold mine along with NN of his friends (thus, total N+1 people including Chef go to the gold mine).
    The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.
    Will Chef and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.

    Input Format :
    First line will contain T, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, three integers N, X, Y.

    Output Format :
    For each testcase, output "YES" if you and your friends can carry all the gold, otherwise output "NO".
    You may print each character of the string in uppercase or lowercase 
    (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

    Constraints :
    1 ≤ T ≤1000
    1 ≤ N,X,Y ≤ 1000
    
    Sample 1:
    Input                       Output
    3                           NO
    2 10 3                      YES
    2 10 4                      YES
    1 5 10

    Explanation :
    Test Case 1: You along with your friends can only carry a maximum of 9(3×3) kg of gold.
    Test Case 2: It is possible to carry all the gold from the mine. 
                 You can carry 4 kg of gold and your both friends carry 3 kg of gold each, 
                 thus carrying the whole 10 kg of gold.
*/

import java.util.Scanner;

public class carrygold{
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);

        int T = s.nextInt();
        if(T<1 || T>1000){
            System.exit(0);
        }

        for(int i=0;i<T;i++){
            int N = s.nextInt();
            if(N<1 || N>1000){
                System.exit(0);
            }

            int X = s.nextInt();
            if(X<1 || X>1000){
                System.exit(0);
            }

            int Y = s.nextInt();
            if(Y<1 || Y>1000){
                System.exit(0);
            }

            if(((N+1)*Y) >= X){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}