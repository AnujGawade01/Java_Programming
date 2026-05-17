// Here we used dynamic memory allocation to allocate size for Marks
import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter number of elements : ");
        Size = sobj.nextInt();

        //Dynamic memory allocation
        float Marks[] = new float[Size];

        //Use the memory 
        //pending

        Marks = null;
        System.gc();
    }
}
