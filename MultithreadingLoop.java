class MultithreadingLoop
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running...");
        
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();
        dobj2.start();

        dobj1.setName("First");
        dobj2.setName("Second");

    }
}

class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i=0; i<=100; i++)
        {
           System.out.println("Inside run method of : "+Thread.currentThread().getName()+" : "+i);
        }
    }
}