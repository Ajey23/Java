/* write a program to calculate percentage of a given student 
in CBSE board exam. His marks from 5 subjects must be take as
input from keyboard (marks are out of 100)
*/

import java.util.Scanner;
class eg1
{
    public static void main(String[] args)
    {
        int s1,s2,s3,s4,s5;
        double total,percentage;


        System.out.println("Please enter marks");
        Scanner mark = new Scanner(System.in);

        System.out.println("enter sub1 marks");
         s1 = mark.nextInt();

        System.out.println("enter sub2 marks");
         s2 = mark.nextInt();

        System.out.println("enter sub3 marks");
         s3 = mark.nextInt();

        System.out.println("enter sub4 marks");
         s4 = mark.nextInt();

        System.out.println("enter sub5 marks");
         s5 = mark.nextInt();

         total=s1+s2+s3+s4+s5;
         percentage = (total/500.0) * 100;

        System.out.println("Percentage " +percentage);

    }
}
