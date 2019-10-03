
import java.util.Scanner;
public class Sample2
{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int a=10;
    int b = s.nextInt();
    int c[] = new int[2];

    try
    {
      System.out.println(a/b);
      c[3]=10;
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }

  }
}
