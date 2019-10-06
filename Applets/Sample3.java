import java.applet.*;
import java.awt.*;
import java.awt.event.*;




/*<applet code="Sample3.class" width=300 height=300>
</applet>*/ 
public class Sample3 extends Applet implements KeyListener
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String msg = "";
    int x=200;int y=150;
    public void init()
    {
        addKeyListener(this);
    }
    public void keyTyped(KeyEvent e)
    {
        msg+=e.getKeyChar();
        repaint();
    }
    public void keyPressed(KeyEvent e)
    {   showStatus("KEY DOWN");
        int c=e.getKeyCode();
        switch(c)
        {
            case KeyEvent.VK_SHIFT:
            {
                msg+="PRESSED  SHIFT";
                break;
            }
            case KeyEvent.VK_ALT:
            {
                msg+="PRESSED ALT KEY";
                break;
            }
            case KeyEvent.VK_CONTROL:
            {
                msg+="PRESSED CONTROL KEY";
                break;
            }
            case KeyEvent.VK_DOLLAR:
            {
                msg+="PRESSED $";
                break;
            }
            case KeyEvent.VK_ENTER:
            {
                msg+="PRESSED RETURN KEY";
                break;
            }
           
        }
    }

    public void keyReleased(KeyEvent e)
    {
        showStatus("KEY UP");
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
   
}