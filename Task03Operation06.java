package assignment03;
import java.util.Scanner;
public class Task03Operation06
{
    public static void main ( String [] args)
    {
        int first,second, third;
        Scanner s = new Scanner(System.in);
        System.out.println(" Please enter the first number:- ");
        first = s.nextInt();
        System.out.println(" Please enter the second number:- ");
        second = s.nextInt();
        System.out.println(" Please enter the third number:- ");
        third = s.nextInt();
        if ( third > second & second > first)
        {
            System.out.println("INCREASING");
        }
        else if ( first > second & second > third)
        {
            System.out.println("DECREASING");
        }
        else
        {
            System.out.println("Neither increasing nor decreasing order");
        }

    }

}
