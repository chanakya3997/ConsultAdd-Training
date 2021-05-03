package assignment03;
import java.util.Scanner;
public class Task03Operation01
{
    public static void main ( String [] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:-");
        number = in.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(+number*i);
        }
    }
}
