//for loop with break statement
//program to stop loop at 50 given loop value is 100

class for3
{
    public static void main(String[] args)
    {
        for( int i=1; i<=100; i++)
        {
            System.out.println(i); //here declared to print 100 numbers

            //now we have to stop loop at 50
            if(i==50)
            {
                break; //with the help of break statement we can stop loop at perticular condition
            }
    }
    }
}
