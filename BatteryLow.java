/*  Problem:
    Chef's phone shows a Battery Low notification if the battery level is 15% or less.
    Given that the battery level of Chef's phone is X%, determine whether it would show a Battery low notification.

    Input Format:
    First line will contain T, number of test cases. Then the test cases follow.
    Each test case contains a single line of input, an integer X, denoting the battery level of the phone.

    Output Format:
    For each test case, output in a single line Yes, if the battery level is 15% or below. Otherwise, print No.
    You may print each character of Yes and No in uppercase or lowercase
    (for example, YeS, YES, yes will be considered identical).

    Constraints:
    1≤T≤100
    1≤X≤100

    Subtasks:
    Subtask #1 (100 points): original constraints

    Sample 1:
    Input       Output
    3           Yes
    15          Yes
    3           No
    65

    Explanation:
    Test Case 1: The battery level is 15. Thus, it would show a battery low notification.
    Test Case 2: The battery level is 3, which is less than 15. Thus, it would show a battery low notification.
    Test Case 3: The battery level is 65, which is greater than 15. Thus, it would not show a battery low notification.
*/

import java.util.Scanner;

public class BatteryLow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        if(t<1 || t>100)
        {
            System.exit(0);
        }
        for(int i =0; i<t; i++)
        {
            int X= s.nextInt();
            if(X<1 || X>100)
            {
                System.exit(0);
            }
            if(X<=15)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
