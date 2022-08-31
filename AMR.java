/*  Problem:
    Kattapa, as you all know was one of the greatest warriors of his time. The kingdom of Maahishmati had never lost a
    battle under him (as army-chief), and the reason for that was their really powerful army, also called as Mahasena.
    Kattapa was known to be a very superstitious person. He believed that a soldier is "lucky" if the soldier is holding
    an even number of weapons, and "unlucky" otherwise. He considered the army as "READY FOR BATTLE" if the count of
    "lucky" soldiers is strictly greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.

    Given the number of weapons each soldier is holding, your task is to determine whether the army formed by all these
    soldiers is "READY FOR BATTLE" or "NOT READY".
    Note: You can find the definition of an even number here.

    Input:
    The first line of input consists of a single integer N denoting the number of soldiers.
    The second line of input consists of N space separated integers A1, A2, ..., AN, where Ai denotes the number of
    weapons that the ith soldier is holding.

    Output:
    Generate one line output saying "READY FOR BATTLE", if the army satisfies the conditions that Kattapa requires or
     "NOT READY" otherwise (quotes for clarity).

    Constraints:
    1 ≤ N ≤ 100
    1 ≤ Ai ≤ 100

    Example 1:
    Input:          Output:
    1               NOT READY
    1

    Example 2
    Input:          Output:
    1               READY FOR BATTLE
    2

    Example 3
    Input:          Output:
    4               NOT READY
    11 12 13 14

    Example 4
    Input:          Output:
    3               READY FOR BATTLE
    2 3 4

    Example 5
    Input:          Output:
    5               NOT READY
    1 2 3 4 5
 */

import java.util.Scanner;

public class AMR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if(N<1|| N>100){
            System.exit(0);
        }

        int[] A = new int[N];
        for (int j=0; j<N;j++) {
            A[j] = s.nextInt();
            if (A[j] < 1 || A[j] > 100) System.exit(0);
        }

        int even=0;
        int odd=0;
        for(int x=0; x<N; x++) {
            if (A[x] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        if(even > odd){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
    }
}
