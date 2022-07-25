//sum of array
//program to caculate sum of array using for loop

class arrsu
{
    public static void main(String [] arr)
    {
        int num[] = {11, 12, 13, 14, 15};
        int sum=0;

        for(int x:num)
        {
            sum=sum+x;
        }
        System.out.println("Sum of array is " + sum);
    }
}
