/*
 Write a program to calculate the percentage of a given student in the CBSE board
exam. His marks from 5 subjects must be taken as input from the keyboard.
*/

import java.util.Scanner;
class Q2
{
    public static void main(String[] args)
    {
        float per;
        int sub1, sub2, sub3, sub4, sub5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sub1 marks");
        sub1 = sc.nextInt();
        System.out.println("Enter sub2 marks");
        sub2 = sc.nextInt();
        System.out.println("Enter sub3 marks");
        sub3 = sc.nextInt();
        System.out.println("Enter sub4 marks");
        sub4 = sc.nextInt();
        System.out.println("Enter sub5 marks");
        sub5 = sc.nextInt();

        per = ((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
        System.out.println("Your Percentage is : " +per);
    }
}

