import java.util.Scanner;
public class Sample3
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int a = 10;
    int b =s.nextInt();
    try
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
      System.out.println(e);
    }
  }
}
