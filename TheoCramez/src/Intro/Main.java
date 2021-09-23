package Intro;

import java.util.concurrent.*;

public class Main {
    public static void main(String args[]) {
        GestionEmployes v_aled = new GestionEmployes(5);
        GestionEmployes v_aled2 = new GestionEmployes(2);
        Thread v_thread = new Thread(v_aled);
        Thread v_thread2 = new Thread(v_aled2);

        v_thread.start();
        v_thread2.start();
    }
}