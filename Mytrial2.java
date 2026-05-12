// Here created a add function and a subtract function
import java.util.Scanner;

class Mytrial2
{
    public static void main(String A[])
    {
        int x, y, z;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter two numbers for Addition :");
        x = sobj.nextInt();
        y = sobj.nextInt();
        z = x + y;
        System.out.println("The Addition is "+z);
        System.out.println("Enter two numbers for Subtraction :");
        x = sobj.nextInt();
        y = sobj.nextInt();
        z = y - x;
        System.out.println("The Subtraction is "+z);
        sobj.close();
    }
}
