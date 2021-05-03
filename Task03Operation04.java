package assignment03;
import java.util.Scanner;
public class Task03Operation04
{
    public static void main ( String [] args)
    {
        int n, sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the integer number (greater than 0):- ");
        n = s.nextInt();
        while (n<0)
        {
            System.out.println("Invalid entry, Please enter the number greater than 0:- ");
            n= s.nextInt();
        }
        for ( int i=1; i<=n; i++)
        {
            System.out.println(+i);
            sum = sum + i;
        }
        System.out.println("Final sum of all natural number till " +n );
        System.out.println(+sum);

    }
}

