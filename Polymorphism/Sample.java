import java.text.SimpleDateFormat;
import java.util.Date;

import org.omg.CORBA.Environment;

class A{
    public int a,same=12;
    A(int x)
    {
        a=x;
    }

    void showdate()
    {  Date date = new Date();

        System.out.println("DATE IS::"+date);
    }
}
class B extends A{
    public int b,c,same=13;
   
    
    B(int x,int y,int z)
    {
        super(x);
        b=y;c=z;

    }
    void showdate()

    {   super.showdate();
        SimpleDateFormat fm = new SimpleDateFormat();
        Date date = new Date();

        System.out.println("DATE IS::"+fm.format(date));
    }
    void show()
    { int sum=a+b+c;
        System.out.println("ADDED VALUE IS::"+sum);
        System.out.println("VALUE IS SUPER CLASS IS::"+super.same);
        System.out.print("VALUE IN SUBCLASS IS::"+same);
    }
}

class Sample{
    public static void main(String [] args)
    {
        B obj=new B(1,2,3);
        obj.show();
        System.out.println("\n");
        obj.showdate();
    }
}