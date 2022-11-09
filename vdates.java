/*  Problem :
    Chef has taken his first dose of vaccine D days ago. 
    He may take the second dose no less than L days 
    and no more than RR days since his first dose.
    Determine if Chef is too early, too late, or in the correct range for taking his second dose.

    Input Format :
    First line will contain T, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, three integers D, L, R.

    Output Format :
    For each test case, print a single line containing one string - "Too Early" (without quotes) if it's too early to take the vaccine, 
    "Too Late" (without quotes) if it's too late to take the vaccine, 
    "Take second dose now" (without quotes) if it's the correct time to take the vaccine.

    Constraints :
    1 ≤ T ≤ 10^5 
    1 ≤ D ≤ 10^9
    1 ≤ L ≤ R ≤ 10^9
 
    Subtasks :
    Subtask 1 (100 points): Original constraints

    Sample 1:
    Input                       Output
    4                           Take the second dose now
    10 8 12                     Too Late
    14 2 10                     Too Early
    4444 5555 6666              Take the second dose now 
    8 8 12

    Explanation:
    Test case 1: The second dose needs to be taken within 8 to 12 days
                 and since the Day 10 lies in this range, we can take the second dose now.
    Test case 2: The second dose needs to be taken within 22 to 10 days 
                 since Day 14 lies after this range, it is too late now.
    Test case 3: The second dose needs to be taken within 5555 to 6666 days 
                 and since the Day 4444 lies prior to this range, it is too early now.
*/

import java.util.Scanner;

public class vdates{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int T = s.nextInt();
        if(T<1 || T>Math.pow(10,5)){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int D = s.nextInt();
            if(D<1 || D>Math.pow(10,9)){
                System.exit(0);
            }

            int L = s.nextInt();
            if(L<1 || L>Math.pow(10,9)){
                System.exit(0);
            }

            int R = s.nextInt();
            if(R<1 || R>Math.pow(10,9)){
                System.exit(0);
            }

            if(L>R){
                System.exit(0);
            }

            if(D<L){
                System.out.println("Too Early");
            }
            else if(D>=L && D<=R){
                System.out.println("Take second dose now");
            }
            else{
                System.out.println("Too Late");
            }
        }
    }
}