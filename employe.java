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
    public static class MonTraitement implements Runnable {

        protected int jour;
        protected int priorite;
        protected String libelle;

        public MonTraitement(int jour, int priorite, String libelle) {
            this.jour = jour;
            this.priorite = priorite;
            this.libelle = libelle;
        }

        @Override
        public void run() {
            employe.getAgenda().addTache(jour, priorite, libelle);

        }
    }
    public static void main(String[] args) {
        MonTraitement monTraitement = new MonTraitement(20, 1, "Document à rendre");
        Thread thread = new Thread(monTraitement);
        thread.start();
    }
}
