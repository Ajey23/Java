/*Write a java program that asks the user to enter his/her name and greets them with
"hello <name>, have a good day" text. */ 

import java.util.Scanner;
class Q5
{
    public static void main(String[] args)
    {
        String x;

        Scanner name = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        x = name.next();

        System.out.println(" Hello " + x + " have a good day");

    }
}