import java.util.Scanner;

public class The_Cheaper_Cab {
public static void main(String[] args) {
    int p1, p2,p3;
    Scanner input = new Scanner(System.in);
    p1 = input.nextInt();
    if(p1<1 || p1>100)
    { System.exit(0);}
    for(int i=0; i<p1; i++)
    {
        p2 = input.nextInt();
        if(p2<1 || p2 >100)
        { System.exit(0);}

        p3 = input.nextInt();
        if(p3<1 || p3 >100)
        { System.exit(0);}

        if(p2<p3){
        System.out.println("FIRST");
        }
        else if(p2>p3){
        System.out.println("SECOND");
        }
        else System.out.println("ANY");
    }
}
}