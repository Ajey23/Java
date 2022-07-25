/* Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show 
correct grade */

class Q3
{
    public static void main(String[] args)
    {
        //assigning student's grade
        int grade=60;

        //encrypting a grade by adding 8 to it
        grade=grade+8;
        System.out.println("Encrypted : " + grade); 

        //now decrypting the grade to show correct grade
        grade=grade-8;
        System.out.println("Decrypting : " + grade);
    }
    
}
