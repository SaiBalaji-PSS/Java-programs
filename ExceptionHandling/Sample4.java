import java.util.Scanner;
public class Sample4{


static void divide(int a,int b) throws ArithmeticException
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


  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a=10;
    int b=s.nextInt();
    try
    {
      divide(a,b);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }

  }
}
