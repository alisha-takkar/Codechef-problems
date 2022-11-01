/*  Problem :
    Suppose Chef is stuck on an island and currently he has x units of food supply and y units of water supply in total 
    that he could collect from the island. He needs xr units of food supply and yr units of water supply per day at the 
    minimal to have sufficient energy to build a boat from the woods and also to live for another day. 
    Assuming it takes exactly D days to build the boat and reach the shore, tell whether Chef has the sufficient amount
    of supplies to be able to reach the shore by building the boat?

    Input :
    First line will contain T, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, five integers x, y, xr, yr, D.

    Output : 
    For each testcase, output in a single line answer "YES" if Chef can reach the shore by building the boat and "NO" if not (without quotes).
    You may print each character of each string in uppercase or lowercase 
    (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

    Constraints :
    1 ≤ T ≤ 300
    1 ≤ x,y ≤ 100
    1 ≤ xr,yr,D ≤ 10

    Sample 1:
    Input                       Output
    3                           YES
    4 2 1 1 1                   NO
    4 2 1 3 1                   NO
    4 2 4 2 2

    Explanation :
    TestCase 1: Chef's food supply will last for 1/4 = 4 days and water supply will last for 1/2 = 2 days,
                so in total he will be able to survive for min(4, 2) = 2 days and since required time to
                reach the shore is 1 day, he will be able to reach there.

    TestCase 2: Chef's food supply will last for 1/4 = 4 days and water supply will last for 3/2 = 0.67 days, 
                so in total he will be able to survive for min(4, 0.67) = 0.67 days and since required time
                to reach the shore is 1 day, he won't be able to reach there.

    TestCase 3: Chef's food supply will last for 4/4 = 1 day and water supply will also last for 2/2 = 1 day,
                so in total he will be able to survive for min(1, 1) = 1 day and since required time to reach 
                the shore is 2 days, he won't be able to reach there.
*/

import java.util.Scanner;

public class ccisland{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        if(T<1 || T>300){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int x = s.nextInt();
            if(x<1 || x>100){
                System.exit(0);
            }

            int y = s.nextInt();
            if(y<1 || y>100){
                System.exit(0);
            }

            int x1 = s.nextInt();
            if(x1<1 || x1>10){
                System.exit(0);
            }

            int y1 = s.nextInt();
            if(y1<1 || y1>10){
                System.exit(0);
            }

            int D = s.nextInt();
            if(D<1 || D>10){
                System.exit(0);
            }

            float food = x/x1;
            float water = y/y1;
            float survive = Math.min(food,water);

            if(survive >= D){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}