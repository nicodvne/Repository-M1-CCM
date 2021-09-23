package com.company;

import java.awt.*;
import javax.swing.*;

public class DrawMyRect extends JPanel {
    public void paint(Graphics g) {

        Pixel p0 = new Pixel(0, 0);
        Pixel p1 = new Pixel(100, 300);
        Pixel p2 = new Pixel(p0.x, p0.y);
        Pixel p3 = new Pixel(p1.x, p1.y);
        Pixel p4;

        p1.printOnScreen();
        p0.printOnScreen();

        p0.translate(300, 0);
        p1.translate(300, 0);

        p1.printOnScreen();
        p0.printOnScreen();

        p4 = Pixel.findCenter(p2, p1, p3, p0);
        p4.printOnScreen();

        Polygon p = new Polygon();

        p.addPoint(p2.x, p2.y);
        p.addPoint(p3.x, p3.y);
        p.addPoint(p1.x, p1.y);
        p.addPoint(p0.x, p0.y);


        g.drawPolygon(p);
        g.drawLine(p2.x,p2.y,p4.x,p4.y);
        g.drawLine(p1.x,p1.y,p4.x,p4.y);
        g.drawLine(p3.x,p3.y,p4.x,p4.y);
        g.drawLine(p0.x,p0.y,p4.x,p4.y);

        /*g.drawRect(p1.x, p1.y, 150, 150);
        g.drawRect(p2.x, p2.y, 150, 150);
        g.drawRect(p3.x, p3.y, 150, 150);
        g.drawRect(p4.x, p4.y, 150, 150);*/


    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Dessiner un rectangle");
        
        f.getContentPane().add(new DrawMyRect());
        f.setSize(500, 500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

