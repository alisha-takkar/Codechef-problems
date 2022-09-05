/*  Problem:
    Chef has N empty bottles where each bottle has a capacity of X litres.
    There is a water tank in Chefland having K litres of water. Chef wants to fill the empty bottles using the water in the tank.
    Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.

    Input Format:
    First line will contain T, number of test cases. Then the test cases follow.
    Each test case contains of a single line of input, three integers N,X, and K.

    Output Format:
    For each test case, output in a single line answer, the maximum number of bottles Chef can fill completely.

    Constraints:
    1≤T≤100
    1≤N,X≤10^5
    0≤K≤10^5

    Sample 1:
    Input       Output
    3           4
    5 2 8       0
    10 5 4      3
    3 1 4

    Explanation:
    Test Case 1: The amount of water in the tank is 8 litres. The capacity of each bottle is 2 litres. Hence, 4 water bottles can be filled completely.
    Test Case 2: The amount of water in the tank is 4 litres. The capacity of each bottle is 5 litres. Hence, no water bottle can be filled completely.
    Test Case 3: The amount of water in the tank is 4 litres. The capacity of each bottle is 1 litre. Chef has 3 bottles available.
     He can fill all these bottles completely using 3 litres of water.
 */

import java.util.Scanner;

public class Chef_Bottle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T>100 || T<1){
            System.exit(0);
        }

        for (int i = 0; i<T; i++){
            int N = s.nextInt();
            if(N<1 || N> Math.pow(10,5)){
                System.exit(0);
            }

            int X = s.nextInt();
            if(X<1 || X> Math.pow(10,5)){
                System.exit(0);
            }

            int K = s.nextInt();
            if(K<0|| K>Math.pow(10,5)){
                System.exit(0);
            }

            if(K > N*X){
                System.out.println(N);
            }
            else {
                System.out.println((K/X));
            }
        }
    }
}
