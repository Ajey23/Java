//Write a program to print sum of 3 number get input from user

import java.util.Scanner;
class Q2
{
    public static void main(String[] args)
    {
        int n1, n2, n3, sum;
        Scanner total= new Scanner(System.in);

        System.out.println("Enter n1");
        n1=total.nextInt();
        System.out.println("Enter n2");
        n2=total.nextInt();
        System.out.println("Enter n3");
        n3=total.nextInt();

        sum=n1+n2+n3;
        System.out.println("Sum of 3 number is : " + sum);
    }
}

