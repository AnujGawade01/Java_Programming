// Here we create a abstract class that contains an abstract and concrete method
class abstract_demoX
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}

abstract class Demo
{
    public int i, j;
    public int Add(int a, int b)    // Concrete method
    {
        return a + b;
    }
    
    public abstract int Sub(int a, int b);
}

class Hello extends Demo
{
    
}
