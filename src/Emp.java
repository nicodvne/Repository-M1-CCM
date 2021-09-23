public class Emp extends Thread {
    private Agenda agenda;
    private boolean Fini;
    private  String nom;

    public Emp(Agenda agenda,String nom) {
        this.agenda = agenda;
        this.nom = nom;
        Fini = agenda.getTs().isEmpty();
    }

    public void run() {
        System.out.println("Démmarage");
        while (!Fini) {
            try {
                sleep(4000);
                finirT();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Erreur");
            }
        }
        System.out.println("Plus de taches");
    }

    private void finirT() {
        for (Tache tache : agenda.getTs()) {
            if (!tache.isFini()) {
                tache.setFini(true);
                System.out.println(""+ this.nom + " a finit la tâche : " + tache.getLib());
                return;
            }
        }

        Fini = true;
    }
}