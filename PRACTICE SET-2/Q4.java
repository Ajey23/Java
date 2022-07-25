/* 
use comparison operators to fing out whether a given number is greater than the user entered number 
or not
*/

import java.util.Scanner;
class Q4
{
    public static void main(String[] args)
    {
        int num;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter number : ");
        num = x.nextInt();

        System.out.println(num>8);
    }
}