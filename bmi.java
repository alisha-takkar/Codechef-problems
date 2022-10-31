/*  Problem :
    You are given the height H (in metres) and mass M (in kilograms) of Chef. 
    The Body Mass Index (BMI) of a person is computed as M/(H^2). 
    Report the category into which Chef falls, based on his BMI:
        Category 1: Underweight if BMI≤18
        Category 2: Normal weight if BMI∈{19, 20,…,24}
        Category 3: Overweight if BMI∈{25, 26,…,29}
        Category 4: Obesity if BMI≥30

    Input :
    The first line of input will contain an integer, T, which denotes the number of testcases. Then the testcases follow.
    Each testcase contains a single line of input, with two space separated integers, M,H, which denote the mass and height of Chef respectively.

    Output : 
    For each testcase, output in a single line, 1,2,3 or 4, based on the category in which Chef falls.

    Constraints :
    1 ≤ T ≤ 2∗(10^4) 
    1 ≤ M ≤ 10^4
    1 ≤ H ≤ 10^2
    Its guaranteed that H^2 divides M.

    Sample 1:
    Input                       Output
    3                           1
    72 2                        2
    80 2                        4
    120 2
*/

import java.util.Scanner;

public class bmi{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();{
            if(T<0 || T>(2*Math.pow(10,4))){
                System.exit(0);
            }

            for(int i=0; i<T; i++){

                int M = s.nextInt();
                if(M<0 || M>Math.pow(10,4)){
                    System.exit(0);
                }

                int H = s.nextInt();
                if(H<0 || H>Math.pow(10,2)){
                    System.exit(0);
                }

                int bmi = (M/(H*H));
                if(bmi<=18){
                    System.out.println("1");
                }

                else if(bmi>=19 && bmi<=24){
                    System.out.println("2");
                }

                else if(bmi>=25 && bmi<=29){
                    System.out.println("3");
                }

                else
                System.out.println("4");
            }
        }

    }
}