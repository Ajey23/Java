/*Write a java program to detect whether a number entered
by the user is integer or not */

import java.util.Scanner;
class Q7
{
    public static void main(String[] args)
    {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(check.hasNextInt());
    }
}