//if else ladder 
//program to check students grade according to their marks

class ifelseladder
{
    public static void main(String arr[])
    {
        int marks=10;

        if(marks>90)
        {
            System.out.println("Grade A");
        }
        else if(marks>70 && marks<=90)
        {
            System.out.println("Grade B");
        }
        else if(marks>50 && marks<=70)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
