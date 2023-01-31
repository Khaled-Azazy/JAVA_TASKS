import java.applet.Applet;
import java.awt.Graphics;
import java.lang.Thread;
import java.util.Date;

public class Timer extends Applet implements Runnable{    
    public void init(){
        Thread th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g){
        Date d = new Date();
        g.drawString(d.toString(), (getWidth()/2) - ((d.toString().length())*3), getHeight()/2);
    }

    public void run(){
        while (true){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
  
}
