/*  Problem:
    In discus throw, a player is given 3 throws and the throw with the longest distance is regarded as their final score.
    You are given the distances for all 3 throws of a player. Determine the final score of the player.

    Input Format:
    First line will contain T, number of test cases. Then the test cases follow.
    Each test case contains of a single line of input, three integers A, B, and C denoting the distances in each throw.

    Output Format:
    For each test case, output the final score of the player.

    Constraints
    1≤T≤100
    1≤A,B,C≤100

    Sample 1:
    Input       Output
    3           15
    10 15 8     32
    32 32 32    82
    82 45 54

    Explanation:
    Test Case 1: The longest distance is achieved in the second throw, which is equal to 15 units. Thus, the answer is 15.
    Test Case 2: In all throws, the distance is 32 units. Thus, the final score is 32.
    Test Case 3: The longest distance is achieved in the first throw which is equal to 82 units. Thus, the answer is 82.
 */

import java.util.Scanner;
import static java.lang.Math.max;

public class Discus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T= s.nextInt();
        if(T<1 || T>100){
            System.exit(0);
        }
        for(int i=0; i<T; i++){
            int A=s.nextInt();
            if(A<1 || A>100){
                System.exit(0);
            }

            int B=s.nextInt();
            if(B<1 || B>100){
                System.exit(0);
            }

            int C=s.nextInt();
            if(C<1 || C>100){
                System.exit(0);
            }

            System.out.println(Math.max(A,(max(B,C))));
        }
    }
}
