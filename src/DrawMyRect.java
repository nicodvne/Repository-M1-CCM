package DrawJForm;
import java.awt.Graphics;
import javax.swing.*;
public class DrawMyRect extends JPanel
{
    public void paint(Graphics g){

        g.drawRect(50, 35, 150, 150);
    }

    public static void main(String[] args){
        JFrame f = new JFrame("Dessiner un rectangle");
        f.getContentPane().add(new DrawMyRect());
        f.setSize(250, 250);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
