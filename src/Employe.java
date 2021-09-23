public class Employe extends Thread {
    private Agenda agenda;
    private boolean travailTerminer;

    public Employe(Agenda agenda) {
        this.agenda = agenda;
        travailTerminer = agenda.getTaches().isEmpty();
    }

    public void run() {
        while (!travailTerminer) {
            try {
                sleep(3000);
                finirTache();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Erreur de la boucle d'un employé");
            }
        }

        System.out.println("\nL'agenda n'a plus de tâches disponible");
        System.out.println("Arrêt de l'employé\n");
    }

    private void finirTache() {
        for (Tache tache : agenda.getTaches()) {
            if (!tache.isTerminer()) {
                tache.setTerminer(true);
                System.out.println("Un employé a finit la tâche : " + tache.getLibelle());
                return;
            }
        }
        // Plus aucune tâche
        travailTerminer = true;
    }
}
