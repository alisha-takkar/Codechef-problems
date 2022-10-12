/*  Problem :-
    The Chessboard Distance for any two points (X1​,Y1) and (X2,Y2) on a Cartesian plane is defined as max(∣X1−X2∣,∣Y1−Y2∣).
    You are given two points (X1,Y1) and (X2,Y2). Output their Chessboard Distance.
    Note that, ∣P∣ denotes the absolute value of integer P. For example, ∣−4∣=4 and ∣7∣=7.

    Input Format :-
    First line will contain T, the number of test cases. Then the test cases follow.
    Each test case consists of a single line of input containing 4 space separated integers - X1,Y1,X2,Y2 - as defined in the 
    problem statement.

    Output Format :-
    For each test case, output in a single line the chessboard distance between (X1,Y1) and (X2,Y2)

    Constraints :-
    1 ≤ T ≤ 1000
    1 ≤ X1,Y1,X2,Y2 ≤ 10^5
 
    Subtasks :-
    Subtask #1 (100 points): original constraints

    Sample 1:
    
    Input                           Output
    3                               3
    2 4 5 1                         2
    5 5 5 3                         2
    1 4 3 3
*/

import java.util.Scanner;
import java.lang.* ;

public class ChessDist{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if( T<0 || T>1000){
            System.exit(0);
        }

        for(int i=0;i<T; i++){

            int X1 = s.nextInt();
            if(X1<0 || X1>(Math.pow(10,5))){
                System.exit(0);
            }

            int Y1 = s.nextInt();
            if(Y1<0 || Y1>(Math.pow(10,5))){
                System.exit(0);
            }

            int X2 = s.nextInt();
            if(X2<0 || X2>(Math.pow(10,5))){
                System.exit(0);
            }

            int Y2 = s.nextInt();
            if(Y2<0 || Y2>(Math.pow(10,5))){
                System.exit(0);
            }

            System.out.println(Math.max(Math.abs(X1-X2), Math.abs(Y1 - Y2))) ;
        }
    }
}