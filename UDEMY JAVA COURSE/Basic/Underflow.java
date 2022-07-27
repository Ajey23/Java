// Java program to check Minimum and Maximum Integer value

class Underflow
{
    public static void main(String args[])
    {
        //INTEGER
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);

        System.out.println("Busted MAX Value = " +(myMaxIntValue + 1));     //Adding +1 to maximum integer value (OVERFLOW)
        System.out.println("Busted MIN Value = " +(myMinIntValue - 1));     //Subtracting -1 to minimum integer value  (UNDERFLOW)

        //BYTE
        int myMinByteValue = Byte.MIN_VALUE;
        int myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Maximum Value = "+myMaxByteValue);

        System.out.println("Busted MAX Value = " +(myMaxByteValue + 1));     //Adding +1 to maximum Byte value (OVERFLOW)
        System.out.println("Busted MIN Value = " +(myMinByteValue - 1));     //Subtracting -1 to minimum Byte value  (UNDERFLOW)

        //FLOAT
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " +myMinFloatValue);
        System.out.println("Float Maximum Vlaue = " +myMaxFloatValue);

    }
}