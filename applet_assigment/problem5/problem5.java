import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

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
public class problem5 extends Applet{

    private int x;
    private int y;
    private int x2;
    private int y2;
    private line tmp;
    private line[] lines;
    private int nOfLines;
    public void init(){
        x = 0;
        y = 0;
        x2 = 0;
        y2 = 0 ;
        nOfLines = 0;
        lines = new line[3];
        tmp = new line(0, 0, 0, 0);
		listener li = new listener();
        this.addMouseListener(li);
        this.addMouseMotionListener(li);
    }

    public void reset(){
        x = x2 = y = y2 = 0;
    }
    public void paint(Graphics g){
        if (nOfLines < 3)
            g.drawLine(tmp.l_x, tmp.l_y, tmp.l_x2, tmp.l_y2);
        for (int i = 0; i < nOfLines; ++i){
            g.drawLine(lines[i].l_x, lines[i].l_y, lines[i].l_x2, lines[i].l_y2);
        }
    }

    class listener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            x = e.getX();
            y = e.getY();   
            System.out.println(x + "  " + y);         
        }
		
		public void mouseDragged(MouseEvent e){
            x2 = e.getX();
            y2 = e.getY();
            tmp = new line(x, y, x2, y2);
            //lines[3] = l;
            repaint();
        }
		public void mouseReleased(MouseEvent e){
            System.out.println(x2+ "  " + y2);         
            if (x2 != 0 && y2 != 0){
                x2 = e.getX();
                y2 = e.getY();
                if (nOfLines >= 3) {
                    repaint();
                }
                else {  
                    line l = new line(x, y, x2, y2);
                    lines[nOfLines] = l;
                    repaint();
                    nOfLines++;
                }
                reset();
            }
            else return ;
            

        }
    }
   
}