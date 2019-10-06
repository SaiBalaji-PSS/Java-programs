import java.applet.*;
import java.awt.*;
//import java.awt.Component.*;
import java.awt.event.*;
/*
<applet code="Sample2.class" width=300 height=300>
</applet>
*/



public class Sample2 extends Applet implements MouseListener,MouseMotionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String msg = "";
    int x=0;int y=0;
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.black);
        setForeground(Color.white);
    }
    public void mouseEntered(MouseEvent e)
    {   msg="Mouse entered the applet";
        x=0;
        y=120;
        repaint();
    }
    public void mouseClicked(MouseEvent e)
    {
        x=(int)e.getX();
        y=(int)e.getY();
        msg="Mouse clicked in the applet";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        x=(int)e.getX();
        y=(int)e.getY();
        msg="Mouse pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        msg="Mouse released";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        msg="Mouse Exited the applet";
        showStatus(msg);
    }
    public void mouseMoved(MouseEvent e)
    {
        x=(int)e.getX();
        y=(int)e.getY();
        msg="Mouse moved at::";
        showStatus(msg+x+","+y);
    }

    public void mouseDragged(MouseEvent e)
    {
        x=(int)e.getX();
        y=(int)e.getY();
        msg=":)";
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);

    }

    
}