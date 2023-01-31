import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
public class problem4 extends Applet{

    private int x;
    private int y;
    private int x2;
    private int y2;

    public void init(){
        x = 0;
        y = 0;
        x2 = 0;
        y2 = 0 ;
        this.addMouseListener(new listener());
        this.addMouseMotionListener(new OtherListener());
    }


    public void paint(Graphics g){
        g.drawLine(x, y, x2, y2);
    }

    class listener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            x = e.getX();
            y = e.getY();
            System.out.println(x + "     " + y);
            
        }
    }
    class OtherListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    }
}