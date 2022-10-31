/*  Problem :
    In a company an emplopyee is paid as under: If his basic salary is less than Rs. 1500, then HRA = 10% of base salary 
    and DA = 90% of basic salary.
    If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. 
    If the Employee's salary is input, write a program to find his gross salary.

    NOTE: Gross Salary = Basic Salary + HRA + DA

    Input :
    The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer salary.

    Output :
    For each test case, output the gross salary of the employee in a new line. 
    Your answer will be considered correct if the absolute error is less than 10^-2.

    Constraints :
    1 ≤ T ≤ 1000
    1 ≤ salary ≤ 100000

    Sample 1:
    Input                       Output
    3                           2406.00
    1203                        20383.16
    10042                       2624
    1312
*/

import java.util.Scanner;

public class flow011{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T<0 || T>1000){
            System.exit(0);
        }

        for(int i =0; i<T; i++){
            double salary = s.nextInt();
            if(salary<0 || salary>100000){
                System.exit(0);
            }

            double HRA = (0.1*salary);
            double DA1 = (0.9*salary);
            double DA2 = (0.98*salary);

            if(salary < 1500){
                System.out.println(salary + HRA + DA1);
            }
            else{
                System.out.println(salary + 500 + DA2);
            }
        }
    }
}