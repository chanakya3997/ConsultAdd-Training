package assignment03;

import java.util.Scanner;

public class Task03Operation02
{
        public static void main ( String [] args)
        {
            int  sum = 0, average;
            Scanner s = new Scanner(System.in);
            int a[] = new int[10];
            for(int i = 0; i <= 9; i++)
            {
                System.out.print("Enter the number ");
                a[i] = s.nextInt();
                sum = sum + a[i];
            }
            average = sum/10;
            System.out.println("Sum:"+sum);
            System.out.println("Average:"+average);
        }

}
