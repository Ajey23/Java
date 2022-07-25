//TAKING INPUT IN JAVA 
//in order to read data from keyboard java has 'Scanner' class.

//take 2 input from user and calculate

import java.util.Scanner; //we need to import Scanner class
class taking_input
{
        public static void main(String[] args)
    {
        System.out.println("Taking input from user");
        Scanner ajay = new Scanner(System.in); //need to declare Scanner class

            System.out.println("Enter number 1"); 
            int a = ajay.nextInt(); //to take input 

            System.out.println("Enter number 2");
            int b = ajay.nextInt(); //to take input

            int sum = a+b; //sumo of given input

            System.out.println("sum of 2 number is " + sum);
    }
}





        