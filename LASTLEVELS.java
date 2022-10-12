/*  Problem :-
    Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.
    There are X levels remaining in the game, and each level takes Chef Y minutes to complete. 
    To protect against eye strain, Chef also decides that every time he completes 3 levels, he will take a Z minute break from playing. 
    Note that there is no need to take this break if the game has been completed.
    How much time (in minutes) will it take Chef to complete the game?

    Input Format :-
    The first line of input will contain a single integer T, denoting the number of test cases.
    The first and only line of input will contain three space-separated integers X, Y, and Z.

    Output Format :-
    For each test case, output on a new line the answer — the length of Chef's gaming session.

    Constraints :-
    1 ≤ T ≤100
    1 ≤ X ≤100
    5 ≤ Y ≤ 100
    5 ≤ Z ≤ 15

    Sample 1 :- 

    Input :-                    Output :-
    4                           24
    2 12 10                     36
    3 12 10                     156
    7 20 8                      1185
    24 45 15
*/

import java.util.Scanner;

public class LASTLEVELS{
public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    if(T<1 || T>100){
        System.exit(0);
    }

    for(int i=0; i<T; i++){
    int X = s.nextInt();
    if(X<1 || X>100){
        System.exit(0);
    }

    int Y = s.nextInt();
    if(Y<5 || Y>100){
        System.exit(0);
    }

    int Z = s.nextInt();
    if(Z<5 || Z>15){
        System.exit(0);
    }

    int sum = 0;

    int a = X%3;
    int b = X/3;
    int c= 0;

    if (a>0){
        c+=b*Z;
        }
        else{
            c+=(b-1)*Z;    
        }

        sum+=(X*Y)+c ; 
    System.out.println(sum);
    }
}
}