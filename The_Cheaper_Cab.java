
/* 
Problem :-
Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format :-
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.

Output Format :-
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.

You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).

Constraints :-
1001≤T≤100
1001≤X,Y≤100

Sample 1:-
Input
Output
3
30 65
42 42
90 50
FIRST
ANY
SECOND

Explanation:
Test case 11: The first cab service is cheaper than the second cab service.

Test case 22: Both the cab services have the same price.

Test case 33: The second cab service is cheaper than the first cab service.
 */

import java.util.Scanner;

public class The_Cheaper_Cab {
    public static void main(String[] args) {
        int p1, p2, p3;
        Scanner input = new Scanner(System.in);
        p1 = input.nextInt();
        if (p1 < 1 || p1 > 100) {
            System.exit(0);
        }
        for (int i = 0; i < p1; i++) {
            p2 = input.nextInt();
            if (p2 < 1 || p2 > 100) {
                System.exit(0);
            }

            p3 = input.nextInt();
            if (p3 < 1 || p3 > 100) {
                System.exit(0);
            }

            if (p2 < p3) {
                System.out.println("FIRST");
            } else if (p2 > p3) {
                System.out.println("SECOND");
            } else
                System.out.println("ANY");
        }
    }
}