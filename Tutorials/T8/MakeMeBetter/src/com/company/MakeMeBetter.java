
import java.util.Scanner;

public class MakeMeBetter
{
    public static void main(String[] args)
    {
        int a1, a2, a3, a4;
        Scanner b = new Scanner(System.in);

        System.out.println("Please input 4 numbers in the range 1-19 :> ");


        int c=0;
        do {
            c = b.nextInt();

            if (c < 1 || c > 19)
                System.out.println("Not in the range 1-19, please try again :> ");
        } while (c < 1 || c > 19);
        a1 = c;


        int d = 0;
        do {
            d = b.nextInt();

            if (d < 1 || d > 19)
                System.out.println("Not in the range 1-19, please try again :> ");
        } while (d < 1 || d > 19);
        a2 = d;


        int e = 0;
        do {
            e = b.nextInt();

            if (e < 1 || e > 19)
                System.out.println("Not in the range 1-19, please try again :> ");
        } while (e < 1 || e > 19);
        a3 = e;


        int f = 0;
        do {
            f = b.nextInt();

            if (f < 1 || f > 19)
                System.out.println("Not in the range 1-19, please try again :> ");
        } while (f < 1 || f > 19);
        a4 = f;
        

        System.out.println("\nThe numbers you input:");
        System.out.print((a1 < 10 ? " " : "") + a1 + "  ");
        System.out.print((a2 < 10 ? " " : "") + a2 + "  ");
        System.out.print((a3 < 10 ? " " : "") + a3 + "  ");
        System.out.print((a4 < 10 ? " " : "") + a4 + "  ");
        System.out.println();
        
        double m = a1;
        if (a2 < m)
        {
            m = a2;
        }
        if (a3 < m)
        {
            m = a3;
        }
        if (a4 < m)
        {
            m = a4;
        }
        
        double x = a1;
        if (a2 > x)
        {
            x = a2;
        }
        if (a3 > x)
        {
            x = a3;
        }
        if (a4 > x)
        {
            x = a4;
        }
        
        double n = (a1 + a2 + a3 + a4) / 4;
        
        System.out.println("The minimum number is: " + m);
        System.out.println("The maximum number is: " + x);
        System.out.println("The average value is: " + n);
    }
}