//Write a program to calculate CGPA using marks of three subjects(out of 100)

class Q3
{
    public static void main(String[] args)
    {
        int math, HTML, CSS;
        double total, CGPA;

        math=80;
        HTML=90;
        CSS=70;

        total = math+HTML+CSS;
        CGPA = (total/30);

        System.out.println("Student's CGPA is : " + CGPA);
    }
}