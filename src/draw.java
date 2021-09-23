import java.awt.Graphics;
import javax.swing.*;

public class draw extends JPanel
{
    public void paint(Graphics g){
        Pixel p1 = new Pixel(0,0);
        Pixel p2 = new Pixel(100,300);
        Pixel[] result = Pixel.creerCarre(p1, p2);
        for(int i=0; i<result.length; i++)
        {

            System.out.print(result[i]);
        }
        Pixel.drawPolygon(g, p1, p2,result[0],result[1]);
        Pixel.drawLine(g, p1, result[0]);
        Pixel.drawLine(g, p2, result[1]);
    }

    public static void main(String[] args){
        JFrame f = new JFrame("Dessiner un polygone");
        f.getContentPane().add(new draw());
        f.setSize(800, 800);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

