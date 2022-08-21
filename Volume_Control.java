/*
    Problem :-
    Chef is watching TV. The current volume of the TV is XX. 
    Pressing the volume up button of the TV remote increases the volume by 1 
    while pressing the volume down button decreases the volume by 1. 
    Chef wants to change the volume from XX to YY.
     Find the minimum number of button presses required to do so.

    Input Format:-
    The first line contains a single integer TT - the number of test cases. Then the test cases follow.
    The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.

    Output Format:-
    For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.

    Constraints:-
    1001≤T≤100
    1001≤X,Y≤100

    Sample 1:
    Input       Output
    2
    50 54       4  
    12 10       2

    Explanation:
    Test Case 1: Chef can press the volume up button 44 times to increase the volume from 5050 to 5454.
    Test Case 2: Chef can press the volume down button 22 times to decrease the volume from 1212 to 1010.
 */

 
import java.util.Scanner;

public class Volume_Control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if(t<1 || t>100)
             System.exit(0);
        for (int i=0; i<t ; i++){
        int i1 = input.nextInt();
        if(i1<1 || i1>100)
             System.exit(0);

        int i2 = input.nextInt();
        if(i2<1 || i2>100)
            System.exit(0);

        if(i1>i2)
            System.out.println(i1 - i2);
        else
            System.out.println(i2 - i1);
    }
}
}