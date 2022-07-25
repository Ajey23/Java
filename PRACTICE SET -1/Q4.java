//Write a program to calculate CGPA using marks of three subjects(out of 100) get input from user

import java.util.Scanner;
class Q4
{
    public static void main(String[] args)
    {
        int math, HTML, CSS;
        double total, CGPA;

        Scanner mark = new Scanner(System.in);
        
        System.out.println("Enter Math marks");
        math = mark.nextInt();
        System.out.println("Enter HTML marks");
        HTML = mark.nextInt();
        System.out.println("Enter CSS marks");
        CSS = mark.nextInt();

        total = math+HTML+CSS;
        CGPA = (total/30);

        System.out.println("Student's CGPA is : " + CGPA);
    }
} 

