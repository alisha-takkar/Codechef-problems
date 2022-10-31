/*  Problem :
    Recently, Devendra went to Goa with his friends. Devendra is well known for not following a budget.
    He had Rs. Z at the start of the trip and has already spent Rs. Y on the trip. 
    There are three kinds of water sports one can enjoy, with prices Rs. A, B, and C. He wants to try each sport at least once.
    If he can try all of them at least once output YES, otherwise output NO.

    Input Format :
    The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
    Each test case consists of a single line of input containing five space-separated integers Z, Y, A, B, C.

    Output Format :
    For each test case, print a single line containing the answer to that test case — YES if Devendra can try each ride at least once, and 
    NO otherwise.
    You may print each character of the string in uppercase or lowercase 
    (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

    Constraints :
    1 ≤ T ≤ 10
    10^4 ≤ Z ≤ 10^5
    0 ≤ Y ≤ Z
    100 ≤ A,B,C ≤ 5000

    Sample 1:
    Input                              Output
    3                                   NO
    25000 22000 1000 1500 700           YES
    10000 7000 100 300 500              YES
    15000 5000 2000 5000 3000

    Explanation:
    Test Case 1: After spending Rs. 22000 on the trip already, Devendra is left with Rs. 3000. 
                 The water sports cost a total of 1000+1500+700 = 3200. 
                 So, he does not have enough money left to try all the watersports.

    Test Case 2: After spending Rs. 10000 on the trip, he is left with Rs. 3000. 
                 The water sports cost a total of 100+300+500 = 900. 
                 So, he has enough money to try all the watersports.

    Test Case 3: After spending Rs. 5000 on the trip, he is left with Rs. 10000.
                 The water sports cost a total of 2000+5000+3000 = 10000.
                 So, he still has enough money left to try all the watersports.
*/

import java.util.Scanner;

public class devsports{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        if(T<0 || T>10){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int Z = s.nextInt();
            if(Z<Math.pow(10,4) || Z>Math.pow(10,5)){
                System.exit(0);
            }

            int Y = s.nextInt();
            if(Y<0 || Y>Z){
                System.exit(0);
            }

            int A = s.nextInt();
            if(A<100 || A>5000){
                System.exit(0);
            }

            int B = s.nextInt();
            if(B<100 || B>5000){
                System.exit(0);
            }

            int C = s.nextInt();
            if(C<100 || C>5000){
                System.exit(0);
            }

            if((Z-Y) >= (A+B+C)){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}