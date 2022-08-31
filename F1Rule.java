/*  Problem:
    Chef has finally got the chance of his lifetime to drive in the F1F1 tournament. But, there is one problem.
    Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.
    Given the fastest finish time as X seconds and Chef's finish time as YY seconds, determine whether Chef will be allowed to race in the main event or not.
    Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.

    Input Format:
    First line will contain T, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, two space separated integers X and Y denoting the fastest finish time and Chef's finish time respectively.

    Output Format:
    For each test case, output YES if Chef will be allowed to race in the main event, else output NO.
    You may print each character of the string in uppercase or lowercase
    (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

    Constraints:
    1≤T≤2⋅10^4
    1≤X≤Y≤200

    Sample 1:
    Input       Output
    4           NO
    1 2         YES
    15 16       NO
    15 17       YES
    100 107

    Explanation:
    Test case 1: The fastest car finished in 1 second. Thus, Chef should have finished on or before 1.07 seconds to
        ensure qualification but he finished in 2 seconds. Hence, Chef will not be allowed to race in the main event.

    Test case 2: The fastest car finished in 15 seconds. Thus, Chef should have finished on or before 16.05 seconds to
    ensure qualification and he managed to finish in 16 seconds. Hence, Chef will be allowed to race in the main event.

    Test case 3: The fastest car finished in 15 seconds. Thus, Chef should have finished on or before 16.05 seconds to
     ensure qualification but he finished in 17 seconds. Hence, Chef will not be allowed to race in the main event.

    Test case 4: The fastest car finished in 100 seconds. Thus, Chef should have finished on or before 107 seconds to
    ensure qualification and he finished just in time for qualification. Hence, Chef will be allowed to race in the main event.
 */

import java.util.Scanner;

import static java.lang.Math.pow;

public class F1Rule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        if (T < 1 || T > (2 * pow(10, 4))) {
            System.exit(0);
        }
        for (int i= 0; i<T; i++)
        {
            int X = s.nextInt();
            int Y = s.nextInt();

            if (X < 1 || X > 200) {
            System.exit(0);
        }
        if (Y < 1 || Y > 200) {
            System.exit(0);
        }

            if (Y <= (1.07 * X)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

