package Intro;

import java.awt.Graphics;

public class Pixel {
	public final static double ORIGIN = 0; //Constante
	private double x;//Champ
	private double y;//Champ
	
	public Pixel(double x, double y) { //Constructeur
		this.x = x;
		this.y = y;
	}
	public Pixel(Pixel pixel) {
		this.x = pixel.x;
		this.y = pixel.y;
	}
	
	public void reset() { //Méthodes d'instances
		x = ORIGIN;
		y = ORIGIN;
	}
	public void printOnScreen() { //Méthodes d'instances
		System.out.println("("+x+","+y+")");
	}
	public static boolean same(Pixel p1, Pixel p2) { //Méthode de classe
		return (p1.x==p2.x) && (p1.y==p2.y);
	}
	public static Pixel mid(Pixel pxl1, Pixel pxl2) {
		return new Pixel((pxl1.x+pxl2.x)/2, (pxl1.y+pxl2.y)/2);
	}
	public void translate(double tx, double ty) {
		x += tx;
		y += ty;
	}
	
	public static Pixel translate2PixelAndGetTheMiddlePixel(Pixel pxl1, Pixel pxl2, double translateX, double translateY) {
		Pixel pxl3 = new Pixel(pxl1);
		Pixel pxl4 = new Pixel(pxl2);
		pxl3.translate(translateX, translateY);
		pxl4.translate(translateX, translateY);
		
		return new Pixel( (pxl1.x+pxl2.x+pxl3.x+pxl4.x)/4, (pxl1.y+pxl2.y+pxl3.y+pxl4.y)/4 );
	}
	
	public static void drawPolygone(Graphics g, Pixel pxl2, Pixel pxl1, Pixel pxl3, Pixel pxl4) {
		int[] xs = {pxl2.getX(), pxl1.getX(), pxl3.getX(), pxl4.getX() };
		int[] ys = {pxl2.getY(), pxl1.getY(), pxl3.getY(), pxl4.getY() };
		
	    g.drawPolygon(xs, ys, 4);
	}
	
	public static void drawLine(Graphics g, Pixel pxl1, Pixel pxl2) {
		g.drawLine(pxl1.getX(), pxl1.getY(), pxl2.getX(), pxl2.getY());
	}
	
	public int getX() {
		return (int)x;
	}
	public int getY() {
		return (int)y;
	}
	
	public static void main(String[] args) { //Méthode de classe
		Pixel p0 = new Pixel(0,0); //Variables locales à la méthode main et objets de la classe Pixel
		p0.printOnScreen(); // (1,3)
		Pixel p1 = new Pixel(1,3);
		p1.printOnScreen(); // (1,3)
		//System.out.println(same(p0,p1)); // false
		//p1.reset();
		//System.out.println(same(p0,p1)); // true
		translate2PixelAndGetTheMiddlePixel(p0, p1, 3, ORIGIN).printOnScreen();
	}
}

