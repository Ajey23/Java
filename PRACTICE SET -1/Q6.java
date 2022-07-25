//Write a java program to convert Kilometer to miles.

import java.util.Scanner;
class Q6
{
    public static void main(String[] args)
    {
        double km;
        Scanner dis = new Scanner(System.in);

        System.out.println("Enter Kilometer  :" );
        km = dis.nextDouble();

        double mm=km/1.6;

        System.out.println("Miles : " +mm);


    }
}