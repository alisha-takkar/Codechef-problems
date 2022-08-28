/*  Problem:
    To access CRED programs, one needs to have a credit score of 750750 or more.
    Given that the present credit score is XX, determine if one can access CRED programs or not.
    If it is possible to access CRED programs, output YES, otherwise output NO.

    Input Format:
    The first and only line of input contains a single integer XX, the credit score.

    Output Format:
    Print YES if it is possible to access CRED programs. Otherwise, print NO.
    You may print each character of the string in uppercase or lowercase
    (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

    Constraints:
    0≤X≤1000

    Subtasks:
    Subtask 1 (100 points): Original constraints.

    Sample 1:
    Input       Output
    823         YES
    Explanation:
    Since 823≥750, it is possible to access CRED programs.

    Sample 2:
    Input       Output
    251         NO
    Explanation:
    Since 251<750, it is not possible to access CRED programs.
 */

import java.util.Scanner;

public class cred {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int c = s.nextInt();
        if(0>c || c>1000){
            System.exit(0);
        }
        if (c >= 750) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
