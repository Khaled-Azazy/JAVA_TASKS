import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class HelloJava extends Applet{

    public void paint(Graphics g){
        //g.drawRect(200, 250, 200, 30);
        g.setColor(Color.YELLOW);
        g.fillOval(150,100,150,50);
        g.setColor(Color.BLACK);
        g.drawOval(150,100,150,50);
        g.drawLine(150, 125, 100, 250);
        g.drawLine(300, 125, 350, 250);
        g.setColor(Color.YELLOW);
        g.fillOval(135,175,25,50);
        g.fillOval(290,175,25,50);
        g.setColor(Color.BLACK);
        g.drawOval(135,175,25,50);
        g.drawOval(290,175,25,50);

        g.setColor(Color.YELLOW);
        g.fillOval(200,175,50,100);
        g.setColor(Color.BLACK);
        g.drawOval(200,175,50,100);
        g.drawArc(100, 200, 250, 100, 180, 180);


        g.drawLine(220, 300, 200, 380);
        g.drawLine(230, 300, 250, 380);
        g.drawRect(125, 380, 200, 20);
        //g.drawLine(300, 125, 350, 250);

        //g.fillOval(150,100,150,50);
        //g.fillOval(150,100,150,50);

    }
}