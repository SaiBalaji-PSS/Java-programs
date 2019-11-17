class MyThread implements Runnable{
    Thread t;
    String name;
    MyThread(String name)
    {
        this.name=name;
        t=new Thread(this,name);
        System.out.println("Thread::"+t);
        t.start();
    }

    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(name+"Is printing"+i);
                Thread.sleep(500);
            }
        }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        
    }
}


public class Sample{
    public static void main(String args[])
    {
        MyThread obj1 = new MyThread("First");
        MyThread obj2 = new MyThread("Second");
        System.out.println("Waiting for others to complete.....");
        
        try
        {
            obj1.t.join();
            obj2.t.join();
        }
        catch(InterruptedException e)
        {

        }
      
        try
        {
            for(int i=0;i<=4;i++)
            {
                System.out.println("MAIN THREAD PRINTS"+""+i);
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e)
        {

        }

        System.out.println("MAIN THREAD EXITING");
    }
}