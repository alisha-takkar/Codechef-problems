/*  Problem:
    Ezio can manipulate at most XX number of guards with the apple of eden.
    Given that there are YY number of guards, predict if he can safely manipulate all of them.

    Input Format:
    First line will contain TT, number of test cases. Then the test cases follow.
    Each test case contains of a single line of input, two integers XX and YY.

    Output Format:
    For each test case, print YES if it is possible for Ezio to manipulate all the guards. Otherwise, print NO.
    You may print each character of the string in uppercase or lowercase
    (for example, the strings YeS,yEs,yes and YES will all be treated as identical).

    Constraints:
    1≤T≤100
    1≤X,Y≤100

    Sample 1:
    Input       Output
    3           NO
    5 7         YES
    6 6         YES
    9 1

    Explanation:
    Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate all of them.
    Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of them.
    Test Case 33: Ezio can manipulate at most 99 guards. Since there is only 11 guard, he can manipulate the guard.
 */

import java.util.Scanner;

public class Manipulate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=0;
        if(s.hasNextInt()) {
            t = s.nextInt();
        }
        if(t<0 || t >100)
        {
            System.exit(0);
        }

        for(int i =0; i<t; i++) {
            int X= 0;
            int Y= 0;
            if(s.hasNextInt()) {
                X = s.nextInt();
            }
            if (X < 0 || X > 100) {
                System.exit(0);
            }

            if(s.hasNextInt()) {
                Y = s.nextInt();
            }
            if (Y < 0 || Y > 100) {
                System.exit(0);
            }

            if (X > Y) {
                System.out.println("Yes");
            } else if (X == Y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
