/*  Problem :
    After a very long time, the Chef has a vacation. 
    Chef has planned for two trips during this vacation - one with his family and the other with his friends. 
    The family trip will take X days and the trip with friends will take Y days. 
    Currently, the dates are not decided but the vacation will last only for Z days.
    Chef can be in at most one trip at any time and once a trip is started, Chef must complete it before the vacation ends.
    Will Chef be able to go on both these trips if he chooses the dates optimally?

    Input Format :
    The first line will contain a single integer T denoting the number of test cases. The description of the test cases follows.
    Each test case consists of a single line of input, which contains three space-separated integers X, Y and Z.

    Output Format :
    For each test case, output in a single line the answer: "YES" if Chef can go on both the trips and "NO" if not.
    You may print each character of each string in uppercase or lowercase 
    (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

    Constraints :
    1 ≤ T ≤ 1000
    1 ≤ X,Y,Z ≤ 1000

    Sample 1:
    Input                       Output
    2                           YES
    1 2 4                       NO
    2 2 3

    Explanation :
    Test case 1: Chef can go to the family trip on day 1 and the friends trip on days 2 and 3.
                 Alternatively, Chef can also plan the trip with friends on days 1 and 2 and the family trip on day 4.
    Test case 2: Chef cannot plan both trips within 3 days.
*/

import java.util.Scanner;

public class chefvacation{
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);

        int T = s.nextInt();
        if(T<1 || T>1000){
            System.exit(0);
        }

        for(int i=0;i<T;i++){
            int X = s.nextInt();
            if(X<1 || X>1000){
                System.exit(0);
            }

            int Y = s.nextInt();
            if(Y<1 || Y>1000){
                System.exit(0);
            }

            int Z = s.nextInt();
            if(Z<1 || Z>1000){
                System.exit(0);
            }

            if((X+Y) <= Z){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}