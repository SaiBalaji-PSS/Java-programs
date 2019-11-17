class Q
{
    boolean cond=false;int n;

    synchronized int get()
    {
        
            try {
                while(!cond)
                {
                wait();
                }
            } catch (InterruptedException e) {
                
            }
        
        System.out.println("GET::"+n);
        cond=false;
        notify();
        return n;
    }

    synchronized void put(int i)
    {
        try
        {
            while(cond)
            {
                wait();
            }
            
        }
        catch(InterruptedException e){}
        n=i;
        System.out.println("PUT::"+n);
        cond=true;
        notify();
    }
}


class producer implements Runnable{
    Q q;
    Thread t;
    producer(Q obj)
    {
        q=obj;
        t=new Thread(this,"PRODUCER");
        t.start();
    }

    public void run()
    {   int i=0;
        while(true)
        {
            q.put(i++);

        }
    }
}


class consumer implements Runnable{
    Q q;
    Thread t;
    consumer(Q obj)
    {
        q=obj;
        t= new Thread(this,"CONSUMER");
        t.start();
    }

    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}


public class Sample4{
    public static void main(String args[])
    {
        Q q = new Q();
        producer t1 = new producer(q);
        consumer t2 = new consumer(q);
        System.out.println("PRESS ctrl+c to stop");
    }
}