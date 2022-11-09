/*  Problem :
    Chefland is holding a virtual marathon for the categories 10 km, 21 km and 42 km having prizes A, B, C (A<B<C) respectively 
    to promote physical fitness. In order to claim the prize in a particular category the person must cover the total distance
    for that category within D days. Also a single person cannot apply in multiple categories.
    Given the maximum distance d km that Chef can cover in a single day, find the maximum prize that Chef can win at the end of D days.
    If Chef can't win any prize, print 0.

    Input :
    The first line contains an integer T, the number of test cases. Then the test cases follow.
    Each test case contains a single line of input, five integers D, d, A, B, C.

    Output :
    For each test case, output in a single line the answer to the problem.

    Constraints :
    1 ≤ T ≤ 50
    1 ≤ D ≤ 10
    1 ≤ d ≤ 5
    1 ≤ A < B < C ≤ 10^5 
 
    Sample 1 :
    Input                       Output
    3                           0
    1 1 1 2 3                   1
    10 1 1 2 3                  2
    10 3 1 2 3

    Explanation :
    Test Case 1: The maximum distance covered by Chef is 1⋅1=1 km  which is less than any of the available distance categories.
                 Hence Chef won't be able to claim a prize in any of the categories.
    Test Case 2: The maximum distance covered by Chef is 10⋅1=10 km which is equal to distance of the first category.
                 Hence Chef can claim the maximum prize of 1 units.
    Test Case 3: The maximum distance covered by Chef is 10⋅3=30 km which is more than the distance of the second category
                 but less than that of the third category. Hence Chef can claim the maximum prize of 2 units.
*/

import java.util.Scanner;

public class mararun{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        if(T<1 || T>50){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int D = s.nextInt();
            if(D<1 || D>10){
                System.exit(0);
            }

            int d = s.nextInt();
            if(d<1 || d>5){
                System.exit(0);
            }

            int A = s.nextInt();
            if(A<1 || A>Math.pow(10,5)){
                System.exit(0);
            }

            int B = s.nextInt();
            if(B<1 || B>Math.pow(10,5)){
                System.exit(0);
            }

            int C = s.nextInt();
            if(C<1 || C>Math.pow(10,5)){
                System.exit(0);
            }

            if(A>=B || B>=C || A>=C ){
                System.exit(0);
            }

            int total = D*d ;

            if(total < 10){
                System.out.println(A);
            }
            else if(total>=10 && total<21){
                System.out.println(B);
            }
            else if(total>=21 && total<42){
                System.out.println(C);
            }
            else
            {
                System.out.println("3");
            }
        }
    }
}