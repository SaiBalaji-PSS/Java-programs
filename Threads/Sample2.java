import java.util.Scanner;

class SumThread implements Runnable{
    Thread t;
    SumThread()
    {
        t=new Thread(this,"Sum thread");
        t.start();
    }
    public void run()
    {   Scanner s = new Scanner(System.in);
      //  System.out.println("Enter the number");
        int n=s.nextInt();
        int sum=0;
        
    
            for(int i=1;i<=n;i++)
            {
                sum+=i;
              
            }

        
        System.out.println("SUM IS::"+sum);
    }
}

class ProductThread implements Runnable{
    Thread t;
    ProductThread()
    {
        t= new Thread(this,"SECOND");
        t.start();
        
    }
      

    public void run()
    {
        int n;
    
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int pr=1;
      
            for(int i=1;i<=n;i++)
            {
                 pr*=i;
               
            }
       

       
        System.out.println("PRODUCT IS::"+pr);
    }
}





public class Sample2{
    public static void main(String []args)
    {    System.out.println("Enter the two numbers");
        SumThread obj= new SumThread();
       
        ProductThread obj2 = new ProductThread();
        try
        {
            obj.t.join();
            obj2.t.join();
        }
        catch(InterruptedException e)
        {
            
        }
        System.out.println("MAIN THREAD EXITING");
    }
}