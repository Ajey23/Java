// Java program to check Minimum and Maximum Integer value

class Underflow
{
    public static void main(String args[])
    {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);

        System.out.println("Busted MAX Value = " +(myMaxIntValue + 1));     //Adding +1 to maximum integer value (OVERFLOW)
        System.out.println("Busted MIN Value = " +(myMinIntValue - 1));     //Subtracting -1 to minimum integer valie  (UNDERFLOW)
    }
}