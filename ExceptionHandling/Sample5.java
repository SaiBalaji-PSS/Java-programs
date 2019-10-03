import java.util.Scanner;
public class Sample5
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a=10;
    int b=s.nextInt();
    try
    {
      div(a,b);
    }
    catch(Exception e)
    {
      System.out.println("EXCEPTION CAUGHT IN MAIN::"+e);
    }
  }
  static void div(int a,int b)
  { try
    {
      if(b==0)
      {
        throw new ArithmeticException();
      }
      else
      {
        System.out.println(a/b);
      }
    }
    catch(ArithmeticException e)
    {
      System.out.println("EXCEPTION CAUGHT IN METHOD"+e);
      throw e;
    }

  }
}
