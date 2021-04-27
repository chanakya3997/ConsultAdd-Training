package consultadd.java.assignment02;
import java.util.Scanner;
public class Task02Operation03
{
    public static void main (String [] args)
    {
        int a,b,c,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of First number:-");
        a = in.nextInt();
        System.out.println("Enter the value of second number:-");
        b = in.nextInt();
        System.out.println("Enter the value of Third number:-");
        c = in.nextInt();
        result = (( a+b+c)/3);
        System.out.println("Average of first,second and third number is:-  " + result );
        if ( result > a & result >b & result > c)
        {
            System.out.println( "Average is greater than a, b and c");
        }
        else if (result > a & result >b )
        {
            System.out.println( "Average is greater than a, b");
        }
        else if (result > a & result >c )
        {
            System.out.println( "Average is greater than a, c");
        }
        else if (result > b & result >c )
        {
            System.out.println( "Average is greater than a, c");
        }
        else if (result > a)
        {
            System.out.println( "Average is greater than a");
        }
        else if (result > b)
        {
            System.out.println( "Average is greater than b");
        }
        else if (result > c)
        {
            System.out.println( "Average is greater than c");
        }


    }
}
