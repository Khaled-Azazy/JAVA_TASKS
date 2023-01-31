import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.event.*;
public class problem1 extends Applet{
    private Button b1;
    private Button b2;
    private int count;
    public void init(){
        count = 0;
        b1 = new Button("+");
        b2 = new Button("-");
        b1.addActionListener(new Mylistener());
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count--;
                repaint();
            }
        });
        add(b1);
        add(b2);
    }

    public void paint(Graphics g){
        g.drawString("click count is " + count, getWidth()/ 2- 30, getHeight()/2);
    }

    class Mylistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            count++;
            repaint();
        }
    }
    

}
