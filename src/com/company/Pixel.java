package com.company;

public class Pixel {
    public final static int ORIGIN = 0;
    public int x;
    public int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void reset() {
        x = ORIGIN;
        y = ORIGIN;
    }

    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public static Pixel findCenter(Pixel p1, Pixel p2, Pixel p3, Pixel p4) {
        int x;
        int y;

        x = (p1.x + p2.x) / 2;
        y = (p3.y + p4.y) / 2;

        return (new Pixel(x, y));
    }

    public void printOnScreen() {
        System.out.println("(" + x + "," + y + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pixel f = (Pixel) obj;
        return x == f.x && y == f.y;
    }

    public static void main(String[] args) {
        Pixel p0 = new Pixel(0, 0);
        Pixel p1 = new Pixel(1, 3);
        Pixel p2 = new Pixel(p0.x, p0.y);
        Pixel p3 = new Pixel(p1.x, p1.y);
        Pixel p4;

        p1.printOnScreen();
        p0.printOnScreen();

        p0.translate(3, 0);
        p1.translate(3, 0);

        p1.printOnScreen();
        p0.printOnScreen();

        p4 = findCenter(p2, p1, p3, p0);
        p4.printOnScreen();

    }
}















