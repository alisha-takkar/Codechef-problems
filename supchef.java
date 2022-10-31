/*  Problem :
    Chef has an exam which will start exactly M minutes from now. 
    However, instead of preparing for his exam, Chef started watching Season-1 of Superchef.
     Season-1 has N episodes, and the duration of each episode is K minutes.
    Will Chef be able to finish watching Season-1 strictly before the exam starts?
    Note: Please read the explanations of the sample test cases carefully.

    Input Format :
    The first line contains an integer T denoting the number of test cases. T test cases then follow.
    The first and only line of each test case contains 3 space separated integers M, N and K.

    Output Format :
    For each test case, output on one line YES if it is possible to finish Season-1 strictly before the exam starts, or 
    NO if it is not possible to do so.
    Output is case insensitive, which means that "yes", "Yes", "YEs", "no", "nO" - all such strings will be acceptable.

    Constraints :
    1 ≤ T ≤ 10^4
    1 ≤ M ≤ 10^9
    1 ≤ N,K ≤10^4

    Sample 1:
    Input                           Output
    3                               NO
    10 1 10                         YES
    25 2 10                         NO
    15 2 10

    Explanation:
    Test Case 1: The duration of the only episode is 10 minutes, and the exam starts exactly after 10 minutes. 
                 So, Chef will not be able to finish watching Season-1 strictly before the exam starts.

    Test Case 2: There are two episodes in Season-1, each of duration 10 minutes. 
                 herefore, Chef will require 10+10=20 minutes to finish watching Season-1. 
                 As the exam starts after 25 minutes, Chef will be able to finish watching Season-1 strictly before the exam starts.

    Test Case 33: There are two episodes in Season-1, each of duration 10 minutes. 
                  Therefore, Chef will require 10+10=20 minutes to finish watchin Season-1.
                  As the exam starts after 15 minutes, Chef will not be able to finish watching Season-1 strictly before the exam starts.
*/

import java.util.Scanner;

public class supchef{
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);
        int T = s.nextInt();
        if(T<0 || T> Math.pow(10,4)){
            System.exit(0);
        }

        for(int i=0; i<T ; i++){
            int M = s.nextInt();
            if(M<0 || M>Math.pow(10,9)){
                System.exit(0);
            }

            int N = s.nextInt();
            if(N<0 || N>Math.pow(10,4)){
                System.exit(0);
            }
            int K = s.nextInt();
            if(K<0 || K>Math.pow(10,4)){
                System.exit(0);
            }

            if((N*K) >= M){
                System.out.println("NO");
            }
            else
            System.out.println("YES");
        }
    }
}