package consultadd.java.assignment02;

import java.util.Scanner;

public class Task02Operation01
{
    public static void main (String [] args)
    {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number : ");
        x = in.nextInt();
        if ( x%3 == 0)
        {
            if ( x%5 == 0)
            {
                System.out.println("Consultadd JAVA Training");
            }
            else
            {
                System.out.println("Consultadd");
            }
        }
        else if ( x%5 == 0)
        {
            System.out.println("JAVA Training");
        }
        else
        {
            System.out.println("Number is not divisible by 3 or 5");
        }

    }

}
