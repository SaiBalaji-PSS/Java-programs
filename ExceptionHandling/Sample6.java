import java.util.Scanner;


class demo extends Exception
{ int age;
  demo(int age)
  {
    this.age=age;
  }

  public String toString()
  {
    String errormessage="Invalid age"+this.age;
    return errormessage;
  }


}

public class Sample6
{
  public static void main(String[] args) {


          Scanner s = new Scanner(System.in);
         int age=s.nextInt();
         try
         {
           if(age<18)
           {
             throw new demo(age);
           }
           else
           {
             System.out.println("Valid");
           }

         }

         catch(demo e)
         {
           System.out.println(e);
         }


  }
}
