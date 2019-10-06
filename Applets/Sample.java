import java.awt.*;
import java.applet.*;

public class Sample extends Applet implements Runnable
{	String msg;
	
	String r;
	String d;
	Thread t=null;
	public void init()
	{  r=getParameter("rno");
	   d=getParameter("dept");
	   msg="Hello world";
	   
	   setForeground(Color.green);
	   
	}
	
	public void start()
	 {
	    msg+="Inside start()";
		t=new Thread(this,"Mythread");
	        t.start();
	 }

  	public void run()
	{
	   try
	   {
		for(;;)
                 {
			repaint();
		        Thread.sleep(500);
	          }

		
	   }
	   catch(InterruptedException e)
           {}
	}
	
      public void paint(Graphics g)
	{    char a = msg.charAt(0);
	      msg=msg.substring(1,msg.length());
	       msg=msg+a;
	    g.drawString(msg,0,200);
	    g.drawString(r,150,124);
	    g.drawString(d,220,125);	
	    
	    showStatus("Hello");
	
	}
	   


}

/* 
<applet code="Sample.class" width="300" height="300"> 
<param name=rno value=125>
<param name=dept value=cse>
</applet> 
*/  