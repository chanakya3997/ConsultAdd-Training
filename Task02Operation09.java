package consultadd.java.assignment02;
import java.util.Scanner;

public class Task02Operation09
{
    public static void main (String [] args)
    {
        Character []  valueArray={'r','a','n','d','o','m','R','A','N','D','O','M'};
        char value;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character:-");
        value = in.next().charAt(0);
        boolean flag = true;
        for ( int i=0;i<=11;i++)
        {
            if ( valueArray[i] == value )
            {
                System.out.println("FOUND");
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("NOT FOUND");
        }

    }
}

