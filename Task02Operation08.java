package consultadd.java.assignment02;
import java.util.Scanner;

public class Task02Operation08
{
    public static void main (String [] args)
    {
        float value,absolute;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:-");
        value = in.nextFloat();
        absolute = Math.abs(value);
        System.out.println("Absolute value of entered number is: "+ absolute);
        if ( value == 0)
        {
            System.out.println("Zero");
        }
        else if ( value < 0)
        {
            if ( absolute < 1)
            {
                System.out.println("Small Negative");
            }
            else if (absolute > 1000000)
            {
                System.out.println("Large Negative");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else if ( value > 0)
        {
            if ( absolute < 1)
            {
                System.out.println("Small Positive");
            }
            else if (absolute > 1000000)
            {
                System.out.println("Large Positive");
            }
            else
            {
                System.out.println("Positive");
            }

        }
    }
}
