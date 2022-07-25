// INCREMENT AND DECREMENT
/* program to increase and decrease the value of x by 1 using 
increment and decrement operators */

class inc_dcr
{
    public static void main(String[] args)
    {
        int x=50;

        System.out.println( ++x );  //PRE-INCREMENT
        System.out.println( --x );  //PRE-DECREMENT
        
        System.out.println( x++ );  //POST-INCREMENT
        System.out.println( x-- );  //POST-DECREMENT

    }
}