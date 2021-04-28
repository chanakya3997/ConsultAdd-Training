package consultadd.java.assignment02;
import java.util.Scanner;
public class Task02Operation07
{
    public static void main (String [] args)
    {
        int value;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:-");
        value = in.nextInt();
        if ( value%2 != 0)
        {
            System.out.println("NEW");
        }
        else
        {
            if (value < 5 && value > 2)
            {
                System.out.println("OLD");
            }
            else if (value < 30 && value > 6)
            {
                System.out.println("NEW");
            }
            else if ( value > 30)
            {
                System.out.println("OLD");
            }
        }

    }
}
