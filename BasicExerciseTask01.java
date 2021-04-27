package consultadd.java.assignment01;
import java.util.Scanner;

public class BasicExerciseTask01
{
public static void main (String [] args)
{
    int x, y, z;
    Scanner in = new Scanner(System.in);
    System.out.println("Input the first number between 1 to 10: ");
    x = in.nextInt();
    while (x > 10 || x < 1)
    {
        System.out.println("Your input does not match the criteria, please enter a number between 1 and 10");
        x = in.nextInt();
    }
    System.out.println("Input the second number between 1 to 10: ");
    y = in.nextInt();
    while (y > 10 || y < 1)
    {
        System.out.println("Your input does not match the criteria, please enter a number between 1 and 10");
        y = in.nextInt();
    }
    System.out.println("Before Swap x = " + x + " & y =  " + y);
    z = x;
    x = y;
    y = z;

    System.out.println("After Swap  x = " + x + " & y =  " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After Swap without third variable  x = " + x + " & y =  " + y);

    z = x + y;
    System.out.println("Value of Z is " + z);
    System.out.println("Value of Z + 30 is  " + (z+30));
}
}
