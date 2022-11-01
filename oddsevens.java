/*  Problem :
     Alice and Bob play the classic game of odds and evens. 
     In this game, each of the two players choose a number between 1 and 5 without revealing to their opponent.
     Both of the players then simultaneously reveal their number by holding up that many fingers of their hand. 
     Then the winner is decided based upon whether the sum of numbers played by both the players is odd or even. 
     In this game we assume that if the sum is odd then Alice wins, otherwise Bob wins.
     If Alice held up aa fingers and Bob held up bb fingers, determine who won the game.

     Input Format :
     First line will contain T, number of testcases. Then the T testcases follow.
     Each testcase contains of a single line of input, two integers a, b which denote the number played by Alice and Bob respectively.

     Output Format :
     For each testcase, output which player won the game.

     Constraints :
     1≤T≤1000
     1≤a,b≤5

     Sample 1:
     
     Input                          Output
     2                              Bob
     1 1                            Alice
     1 2

     Explanation:
     In the first test case, Alice and Bob both played 1. The sum of the numbers played by them is 2 which is even. Therefore Bob wins.
     In the second test case, Alice played 1 while Bob played 2. The sum of the numbers played by them is 3 which is odd. Therefore Alice wins.
*/

import java.util.Scanner;

public class oddsevens{
    public static void main(String[] args){

        Scanner s  = new Scanner(System.in);
        int T = s.nextInt();
        if(T<0 || T>1000){
            System.exit(0);
        }

        for(int i=0; i<T; i++){
            int a = s.nextInt();
            if(a<1 || a>5){
                System.exit(0);
            }

            int b = s.nextInt();
            if(b<1 || b>5){
                System.exit(0);
            }

            if((a+b)%2 == 0){
                System.out.println("Bob");
            }
            else
            System.out.println("Alice");
        }
    }
}