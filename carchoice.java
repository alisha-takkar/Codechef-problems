/*  Problem :
    Chef is planning to buy a new car for his birthday. After a long search, he is left with 2 choices:
    Car 1: Runs on diesel with a fuel economy of x1​ km/l
    Car 2: Runs on petrol with a fuel economy of x2 km/l
    Chef also knows that
    the current price of diesel is y1 rupees per litre
    the current price of petrol is y2 rupees per litre
    Assuming that both cars cost the same and that the price of fuel remains constant, which car will minimize Chef's expenses?

    Print your answer as a single integer in the following format

    If it is better to choose Car 1, print −1
    If both the cars will result in the same expenses, print 0
    If it is better to choose Car 2, print 1

    Input Format :
    The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
    Each test case consists of a single line containing 4 space-separated integers — x1, x2, y1, y2

    Output Format :
    For each test case, output in a single line the answer as explained earlier.

    Constraints :
    1 ≤ T ≤ 10000
    1 ≤ x1,x2,y1,y2 ≤ 50

    Sample 1:
    Input                          Output
    3                              -1                   
    10 5 3 20                       0
    7 2 7 2                         1
    1 5 3 2

    Explanation:
    Test Case 1: The cost of driving Car 1 is 10/3 =0.3 rs/km, and the cost of driving Car 2 is 20/5 =4 rs/km.
                 Therefore, Car 1 is cheaper to drive, so the output is −1.
    Test Case 2: The cost of driving Car 1 is 1 rs/km, and the cost of driving Car 2 is also 1 rs/km. 
                 Both cars offer the same economy, so the output is 0.
    Test Case 3: The cost of driving Car 1 is 3 rs/km and the cost of driving Car 2 is 0.4 rs/km. 
                 Therefore, Car 2 is cheaper to drive, so the output is 1.
*/

import java.util.Scanner;

public class carchoice{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T<0 || T>10000){
            System.exit(0);
        }

        for(int i=0;i<T;i++){
            int x1 = s.nextInt();
            if(x1<0 || x1>50){
                System.exit(0);
            }

            int x2 = s.nextInt();
            if(x2<0 || x2>50){
                System.exit(0);
            }

            double y1 = s.nextInt();
            if(y1<0 || y1>50){
                System.exit(0);
            }

            double y2 = s.nextInt();
            if(y2<0 || y2>50){
                System.exit(0);
            }

            if((y1/x1) < (y2/x2)){
                System.out.println("-1");
            }
            else if((y1/x1) == (y2/x2)){
                System.out.println("0");
            }
            else
            System.out.println("1");
        }
    }
}