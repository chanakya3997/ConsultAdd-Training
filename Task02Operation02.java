package consultadd.java.assignment02;
import java.util.Scanner;
public class Task02Operation02
{
    public static void main (String [] args)
    {
        float first,second,first1,second2,operator,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose from the following operation:-");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Average");
        operator =  in.nextFloat();
        while (operator > 5 || operator < 1)
        {
            System.out.println("Your input does not match the criteria, please enter a number between 1 and 5");
            operator = in.nextFloat();
        }
        if ( operator == 1)
        {
            System.out.println("Enter the value of First number:-");
            first = in.nextFloat();
            System.out.println("Enter the value of second number:-");
            second = in.nextFloat();
            result = first + second;
            System.out.println("Addition of first and second number is:-  " + result);
            if ( result <0 )
            {
                System.out.println("Oops option 1 is returning the negative number");
            }
        }
        else if ( operator == 2)
        {
            System.out.println("Enter the value of First number:-");
            first = in.nextFloat();
            System.out.println("Enter the value of second number:-");
            second = in.nextFloat();
            result = first - second;
            System.out.println("Subtraction of first and second number is:-  " + result);
            if ( result <0 )
            {
                System.out.println("Oops option 2 is returning the negative number");
            }
        }
        else if ( operator == 3)
        {
            System.out.println("Enter the value of First number:-");
            first = in.nextFloat();
            System.out.println("Enter the value of second number:-");
            second = in.nextFloat();
            result = first * second;
            System.out.println("Multiplication of first and second number is:-  " + result);
            if ( result <0 )
            {
                System.out.println("Oops option 3 is returning the negative number");
            }
        }
        else if ( operator == 4)
        {
            System.out.println("Enter the value of First number:-");
            first = in.nextFloat();
            System.out.println("Enter the value of second number:-");
            second = in.nextFloat();
            result = first / second;
            System.out.println("Division of first and second number is:-  " + result);
            if ( result <0 )
            {
                System.out.println("Oops option 4 is returning the negative number");
            }
        }
        else if ( operator == 5)
        {
            System.out.println("Enter the value of First number:-");
            first1 = in.nextFloat();
            System.out.println("Enter the value of second number:-");
            second2 = in.nextFloat();
            result = (( first1+second2)/2);
            System.out.println("Average of first and second number is:-  " + result );
            if ( result <0 )
            {
                System.out.println("Oops option 5 is returning the negative number");
            }
        }

    }
}
