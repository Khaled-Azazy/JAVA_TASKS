import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;


public class problem7 extends Applet{

    private int x;
    private int y;
    private String str;
    private final int move = 20;
    public void init(){
        x = 100;
        y = 100;
        str = new String("HELLO JAVA");
        this.addKeyListener(new listener());
    }

    public void paint(Graphics g){
        g.drawString(str, x, y);
    }

    class listener implements KeyListener{
        public void keyTyped(KeyEvent e){

        }
        public void keyPressed(KeyEvent e){
            System.out.println("enter");
            if (KeyEvent.VK_UP == e.getKeyCode()){

                y -= move;
            }
            else if (KeyEvent.VK_DOWN == e.getKeyCode()){
                y += move;
            }
            else if (KeyEvent.VK_RIGHT == e.getKeyCode()){
                x += move;
            }
            else if (KeyEvent.VK_LEFT == e.getKeyCode()){
                x -= move;
            }
            repaint();
        }
        public void keyReleased(KeyEvent e){

        }
    }
   
    
}