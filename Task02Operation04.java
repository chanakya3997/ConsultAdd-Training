package consultadd.java.assignment02;
import java.util.Scanner;
public class Task02Operation04
{
    public static void main (String [] args)
    {
        int value;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter any number:-");
            value = in.nextInt();
            if ( value >= 0 )
            {
                System.out.println("Good Going");
                continue;
            }
            else
            {
                System.out.println("Its over");
                break;
            }

        }
    }
}
