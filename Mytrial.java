// created on 20th March 2026 as a self code
import java.util.Scanner;

class Mytrial           // Wrote the first letter of class in uppercase as "Class"
{
    public static void main(String A[])
    {
        int x, y, z;  // i initialized the values again with zero
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        x = sobj.nextInt();     //I did'nt add the "=" operator here
        y = sobj.nextInt();     //I did'nt add the "=" operator here
        z = x + y;
        System.out.println("Addition of the two number is : "+z);
        sobj.close();         //Added it as the google ai suggested it as better practice
        }
}


