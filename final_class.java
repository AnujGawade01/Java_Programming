// Here we create a final class and created its child class which will give error
class final_class
{
    public static void main(String A[])
    {   
        Demo dobj = new Demo();     // Allowed

        Hello hobj = new Hello();
    }
}

final class Demo
{
    public void fun()
    {   System.out.println("Inside Demo fun");  };

    public void gun()
    {   System.out.println("Inside Demo gun");  };
}

class Hello extends Demo    // Error
{
    public void gun()
    {   System.out.println("Inside Hello gun");  };
}
