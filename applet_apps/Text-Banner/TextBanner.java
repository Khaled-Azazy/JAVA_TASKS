import java.applet.Applet;
import java.awt.Graphics;
import java.lang.Thread;
public class TextBanner extends Applet implements Runnable{
    private int x;
    final private int SPEED = 10;
    
    public void init(){
        x = 0;
        Thread th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g){
        g.drawString("Hello applet",x, 200);
        if (x >= getWidth()) x = -30;
        else x += SPEED;
    }
	
	 public void run(){
        while (true){
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
  

}