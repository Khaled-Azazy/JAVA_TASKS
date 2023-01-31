import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class AnimationBall extends Applet implements Runnable{

    private int x;
    private int y;
    private final int SPEED = 30;
    private int ballWidth = 50;
    private int ballHeight = 50;

    private boolean movingLeft = false;
    private boolean movingUp = false;
    
    public void init(){
        x = 100;
        y = 50;
        Thread th = new Thread(this);
        th.start();
    }


    public void paint(Graphics g){
        if (x + ballWidth>= getWidth()){
            movingLeft = true;
        }
        if (x <= 0) {movingLeft = false;}
        if (!movingLeft) {x += SPEED;}
        else {x -= SPEED;}

        if (y <= 0) {movingUp = true;}
        if (y + ballHeight >= getHeight()) movingUp = false;

        if (movingUp) y += SPEED + 10;
        else y -= SPEED - 10;
        g.setColor(Color.RED);
        g.fillOval(x, y, ballWidth, ballHeight);
       
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