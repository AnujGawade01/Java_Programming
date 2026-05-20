class abstract_demo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();     // Error
    }
}

abstract class Demo
{
    public int i, j;
    public int Add(int a, int b)    // Concrete method
    {
        return a + b;
    }
}