/*  Problem :
    Chef is currently facing the north direction. Each second he rotates exactly 90 degrees in clockwise direction.
    Find the direction in which Chef is facing after exactly X seconds.
    Note: There are only 4 directions: North, East, South, West (in clockwise order).

    Input Format :
    First line will contain T, number of testcases. Then the testcases follow.
    Each testcase contains of a single integer X.

    Output Format :
    For each testcase, output the direction in which Chef is facing after exactly X seconds.

    Constraints :
    1 ≤ T ≤ 100
    1 ≤ X ≤ 1000

    Sample 1 :
    Input                       Output
    3                           East
    1                           West
    3                           South
    6

    Explanation :
    Chef is facing North in the starting.
    Test Case 1: After 1 second he turns 90 degrees clockwise and now faces the east direction.

    Test Case 2: Direction after 1 second- east
                 Direction after 2 seconds- south
                 Direction after 3 seconds- west
*/

import java.util.Scanner;

public class facedir{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        if(T<1 || T>100){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int X = s.nextInt();
            if(X<1 || X>1000){
                System.exit(0);
            }

            int dir = X%4 ;

            if(dir == 1){
                System.out.println("East");
            }
            else if(dir == 2){
                System.out.println("South");
            }
            else if(dir == 3){
                System.out.println("West");
            }
            else{
                System.out.println("North");
            }
        }
    }
}