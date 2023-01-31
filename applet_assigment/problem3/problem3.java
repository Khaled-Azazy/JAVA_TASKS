import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
public class problem3 extends Applet{

    private int x;
    private int y;
    private int ballWidth = 50;
    private int ballHeight = 50;

    public void init(){
        x = 100;
        y = 200;
        this.addMouseMotionListener(new listener());
    }


    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, ballWidth, ballHeight);
    }

    class listener implements MouseMotionListener{
        public void mouseDragged(MouseEvent e){
            int new_x = e.getX();
            int new_y = e.getY();
            if (new_x >= x-ballWidth && new_x <= x+ballWidth){
                if (new_y >= y-ballHeight && new_y <= y+ballHeight) {
                    x = new_x - ballWidth/2;
                    y = new_y - ballHeight/2;
                    repaint();
                }
            }
            
        }
        public void mouseMoved(MouseEvent e){
            
        }

    }
}