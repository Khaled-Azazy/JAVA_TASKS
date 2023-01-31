import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.*;
public class problem2 extends Applet{

    private Button b1;
    private Button b2;
    private MyThread th;
    private int x;
    private int y;
    private final int SPEED = 30;
    private int ballWidth = 50;
    private int ballHeight = 50;
    private boolean exit = false;
    private boolean movingLeft = false;
    private boolean movingUp = false;
    public void init(){
        x = 100;
        y = 200;
        th = new MyThread();
        b1 = new Button("Start");
        b2 = new Button("Stop");
        b1.addActionListener(new StartListening());
        b2.addActionListener(new StopListening());
        add(b1);
        add(b2);
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
        else y -= SPEED + 10;
        g.setColor(Color.RED);
        g.fillOval(x, y, ballWidth, ballHeight);
       
    }

    

    class MyThread extends Thread{
        public void run(){
            while (exit==false){
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class StartListening implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (th.isAlive()) ;
            else {
                exit = false;
                th = new MyThread();
                th.start();
                System.out.println("starting new thread " + Thread.activeCount() + "  " + Thread.currentThread());
            }
        }
    }
    class StopListening implements ActionListener{
        public void actionPerformed(ActionEvent e){
            exit = true;
            
        }
    }
}