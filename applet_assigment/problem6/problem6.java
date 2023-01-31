import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Vector;

class line {
    public int l_x;
    public int l_y;
    public int l_x2;
    public int l_y2;
    line(int a,int b,int c,int d){
        l_x = a;
        l_y = b;
        l_x2 = c;
        l_y2 = d;
    }
}
public class problem6 extends Applet{

    private int x;
    private int y;
    private int x2;
    private int y2;
    private boolean flag = false;
    private Vector<line> lines;
    private line tmp;
    public void init(){
        x = 0;
        y = 0;
        x2 = 0;
        y2 = 0 ;
        lines = new Vector<line>();
        this.addMouseListener(new listener());
        this.addMouseListener(new listener2());
        this.addMouseMotionListener(new OtherListener());
    }

    public void reset(){
        x = x2 = y = y2 = 0;
    }
    public void paint(Graphics g){
        if (flag) g.drawLine(tmp.l_x, tmp.l_y, tmp.l_x2, tmp.l_y2);
        for (int i = 0; i < lines.size(); ++i){
            line l = lines.get(i);
            g.drawLine(l.l_x, l.l_y, l.l_x2, l.l_y2);
        }
    }

    class listener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            x = e.getX();
            y = e.getY();   
            System.out.println(x + "  " + y);         
        }
    }
    class listener2 extends MouseAdapter{
        public void mouseReleased(MouseEvent e){
            System.out.println(x2 + "   " + y2);
            if (x2 != 0 && y2 != 0){
                x2 = e.getX();
                y2 = e.getY();
                lines.add(new line(x, y, x2, y2));
                reset();
                flag = false;
                repaint();
            }
            else return ;
            

        }
    }
    class OtherListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            tmp = new line(x, y, x2, y2);
            flag = true;
            repaint();
        }
    }
}