package assignment03;
import java.util.Scanner;
public class Task03Operation03
{
    public static void main ( String [] args)
    {
        int month, year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the month number:- ");
        month = s.nextInt();
        while (month > 12 || month < 1)
        {
            System.out.println("Invalid Details");
            System.out.println("Month number should be between 1 and 12");
            System.out.println("Enter the month number:- ");
            month = s.nextInt();
        }
        if ( month == 1 ||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12)
        {
            System.out.println("Entered month has 31 days");
        }
        else if (month == 4 ||month == 6||month == 9||month == 11 )
        {
            System.out.println("Entered month has 30 days");
        }
        else
        {
            System.out.println("Enter the year:-");
            year = s.nextInt();
            if ( year%4 == 0)
            {
                System.out.println("You have entered leap year");
                System.out.println("Entered month has 29 days");
            }
            else
            {
                System.out.println("You have entered non leap year");
                System.out.println("Entered month has 28 days");
            }
        }

    }
}
