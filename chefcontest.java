/*  Problem :
    Chef and Chefina are competing against each other in a programming contest.
    They were both able to solve all the problems in the contest, so the winner between them must be decided by time penalty. 
    Chef solved all the problems in X minutes and made P wrong submissions, while 
    Chefina solved all the problems in Y minutes and made Q wrong submissions. 
    Who won the competition (or was it a draw)?

    Note: The time penalty is calculated as follows:
    The base time penalty is the time at which the final problem was solved (so, X for Chef and Y for Chefina)
    Each wrong submission adds a penalty of 10 minutes
    The winner is the person with less penalty time. If they both have the same penalty, it is considered a draw.

    Input Format :
    The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
    The first and only line of each test case contains four space-separated integers — X,Y,P, and Q respectively.

    Output Format :
    For each test case, output a single line containing one string — the name of the winner ("Chef" or "Chefina"), or 
    "Draw" if the match was a draw. Print each string without the quotes.
    Each character of the answer can be printed in either uppercase or lowercase, i.e, 
    the strings "Chef", "chEf", "cHeF", etc. are treated as equivalent.

    Constraints :
    1 ≤ T ≤ 1000
    1 ≤ X,Y ≤ 100
    0 ≤ P,Q ≤ 100

    Sample 1:
    Input                       Output
    3                           Chef
    10 8 2 3                    Draw
    10 10 10 10                 Chefina
    40 21 2 0    

    Explanation :
    Test Case 1:
    Chef solved the problems in 10 minutes and made 2 wrong submissions, thus his total penalty is 10+2⋅10=30 minutes.
    Chefina solved the problems in 8 minutes and made 3 wrong submissions, thus her total penalty is 8+3⋅10=38 minutes.
    Chef took less time, so he is the winner.

    Test Case 2:
    Chef solved the problems in 10 minutes and made 10 wrong submissions, thus his total penalty is 10+10⋅10=110 minutes.
    Chefina solved the problems in 10 minutes and made 3 wrong submissions, thus her total penalty is 10+10⋅10=110 minutes.
    Chef and Chefina took the same time, so the match is a draw.

    Test Case 3:
    Chef solved the problems in 40 minutes and made 2 wrong submissions, thus his total penalty is 40+2⋅10=60 minutes.
    Chefina solved the problems in 21 minutes and made 0 wrong submissions, thus her total penalty is 21+0⋅10=21 minutes.
    Chefina took less time, so she is the winner.
*/

import java.util.Scanner;

public class chefcontest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T =s.nextInt();
        if(T<0 || T>1000){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
             int X = s.nextInt();
             if(X<=0 || X>100){
                System.exit(0);
             }

             int Y = s.nextInt();
             if(Y<=0 || Y>100){
                System.exit(0);
             }

             int P = s.nextInt();
             if(P<0 || P>100){
                System.exit(0);
             }

             int Q = s.nextInt();
             if(Q<0 || Q>100){
                System.exit(0);
             }

             int a = X + (P*10);
             int b = Y + (Q*10);

             if(a>b){
                System.out.println("Chefina");
             }
             else if(a==b){
                System.out.println("Draw");
             }
             else
             System.out.println("Chef");
        }
    }
}