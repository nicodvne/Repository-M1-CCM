import DrawJForm.DrawMyLine;
import java.awt.Graphics;

import javax.swing.*;
import java.awt.*;

public class Pixel extends JPanel{
    public final static int ORIGIN = 0; //Constante
    private int x;//Champ
    private int y;//Champ
    public Pixel(int x,int y) { //Constructeur
        this.x = x;
        this.y = y;
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

    public static double distancePoints(Pixel p1, Pixel p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }


    public static Pixel[] creerCarre(Pixel p1, Pixel p2) {
        double distanceVertical = distancePoints(p1, p2);
        System.out.println("Distance entre le point 1 et 2 : " + distanceVertical);
        Pixel p3 = new Pixel(p1.x + (int) distanceVertical, p1.y);
        Pixel p4 = new Pixel(p2.x + (int) distanceVertical, p2.y);
        System.out.println("Point 1 (x:" + p1.x + ", y:" + p1.y + ")");
        System.out.println("Point 2 (x:" + p2.x + ", y:" + p2.y + ")");
        System.out.println("(new) Point 3 (x:" + p3.x + ", y:" + p3.y + ")");
        System.out.println("(new) Point 4 (x:" + p4.x + ", y:" + p4.y + ")");
        Pixel pointCentral = null;
        pointCentral = new Pixel((int) distanceVertical / 2, (int) distanceVertical / 2);
        System.out.println("(new) Point Central (x:" + pointCentral.x + ", y:" + pointCentral.y + ")");
        Pixel[] data = {p3, p4};
        return data;
    }

    public static void drawPolygon(Graphics g, Pixel p1, Pixel p2, Pixel p3, Pixel p4)
    {
        int[] x = {p1.x,p2.x,p3.x,p4.x};
        int[] y = {p1.y, p2.y, p3.y, p4.y};
        g.drawPolygon(x, y, 4);
    }
    public static void drawLine(Graphics g, Pixel p1, Pixel p2)
    {
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

    public static void main() {
        Pixel p1 = new Pixel(0,0);
        Pixel p2 = new Pixel(100,300);
        Pixel.creerCarre(p1, p2);
    }
}

