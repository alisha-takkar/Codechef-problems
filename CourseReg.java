/*  Problem:
    There is a group of N friends who wish to enroll in a course together.
    The course has a maximum capacity of M students that can register for it.
    If there are K other students who have already enrolled in the course,
    determine if it will still be possible for all the NN friends to do so or not.

    Input Format:
    The first line contains a single integer T - the number of test cases. Then the test cases follow.
    Each test case consists of a single line containing three integers N, M and K - the size of the
    friend group, the capacity of the course and the number of students already registered for the course.

    Output Format:
    For each test case, output Yes if it will be possible for all the NN friends to register for the course.
    Otherwise, output No.
    You may print each character of Yes and No in uppercase or lowercase
    (for example, yes, yEs, YES will be considered identical).

    Constraints:
    1≤T≤1000
    1≤N≤M≤100
    0≤K≤M

    Sample 1:
    Input           Output
    3               Yes
    2 50 27         No
    5 40 38         Yes
    100 100 0

    Explanation:
    Test Case 1: The 2 friends can enroll in the course as it has enough seats to accommodate them
     and the 27 other students at the same time.
    Test Case 2: The course does not have enough seats to accommodate the 5 friends
    and the 38 other students at the same time.
*/

import java.util.Scanner;

public class CourseReg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        if(0>t || t>1000)
        {
            System.exit(0);
        }

        for(int i=0;i<t;i++)
        {
            int N = s.nextInt();
            if(0>N || N>100)
            {
                System.exit(0);
            }
            int M = s.nextInt();
            if(0>M || M>100)
            {
                System.exit(0);
            }
            int K = s.nextInt();
            if(0>K || K>M)
            {
                System.exit(0);
            }
            if(N<= (M-K))
            {System.out.println("YES");}
            else {
                System.out.println("NO");
            }
        }
    }
}
