/*  Problem :
    Chef prepared a problem. The admin has rated this problem for x points.
    A problem is called :
    Easy if 1≤x<100
    Medium if 100≤x<200
    Hard if 200≤x≤300
    Find the category to which Chef’s problem belongs.

    Input Format :
    The first line contains T denoting the number of test cases. Then the test cases follow.
    The first and only line of each test case contains a single integer x.

    Output Format :
    For each test case, output in a single line the category of Chef's problem, i.e whether it is an Easy, Medium or Hard problem. 
    The output is case sensitive.

    Constraints ::
    1 ≤ T ≤ 50
    1 ≤ x ≤ 300

    Subtasks :
    Subtask 1 (100 points): Original constraints

    Sample 1 :
    Input                           Output
    3                               Easy
    50                              Medium
    172                             Hard
    201

    Explanation:
    Test case 1: The problem with rating x = 50 is an easy problem as 1 ≤ 50 < 100.
    Test case 2: The problem with rating x = 172 is a medium problem as 100 ≤ 172 < 200.
    Test case 3: The problem with rating x = 201 is a hard problem as 200 ≤ 201 ≤ 300.
*/

import java.util.Scanner;

public class probcat{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T<0 ||  T>50){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
         int x = s.nextInt();
        if(x<0 ||  x>300){
            System.exit(0);
        }   

        if(x>=1 && x<100){
            System.out.println("Easy");
        }
        else if(x>=100 && x<200){
            System.out.println("Medium");
        }
        else
        System.out.println("Hard");
        }
    }
}