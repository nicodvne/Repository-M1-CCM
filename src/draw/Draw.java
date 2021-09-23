package draw;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Intro.Pixel;

public class Draw extends JPanel {
	public void paint(Graphics g){
		Pixel pxl1 = new Pixel(0,0);
		Pixel pxl2 = new Pixel(100,300);
		Pixel pxl3 = new Pixel(pxl1);
		Pixel pxl4 = new Pixel(pxl2);
		pxl3.translate(300, 0);
		pxl4.translate(300, 0);
		
		Pixel.drawPolygone(g, pxl2, pxl1, pxl3, pxl4);
		Pixel.drawLine(g, pxl1, pxl4);
		Pixel.drawLine(g, pxl2, pxl3);
	  }
	
	public static void main(String[] args){
	    JFrame f = new JFrame("Draw");
	    f.getContentPane().add(new Draw());
	    f.setSize(500, 500);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
}
