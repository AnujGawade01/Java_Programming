// Here we create demo thread by implementing Runnable interface
class ThreadScenario2
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running...");
        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);

        tobj.start();
    }
}

class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}
