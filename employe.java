package com.company;

public class employe {

    protected static String name;
    protected static agenda a;

    public employe(String name) {
        a = new agenda();
        employe.name = name;
    }
    public static agenda getAgenda() {
        return a;
    }
    public static class MonTraitement extends Thread {

        @Override
        public void run() {
            employe.getAgenda().addTache(25, 1, "Document à rendre");

        }
    }
    public static void main(String[] args) {
        Runnable runnable = new MonTraitement();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
