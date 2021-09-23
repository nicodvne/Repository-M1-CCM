import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    private List<Tache> taches;

    Agenda() {
        taches = new ArrayList<>();
    }

    Agenda(List<Tache> taches) {
        this.taches = taches;
    }

    // Fonctions utilitaires
    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public void ajouterTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public void retirerTache(Tache tache) {
        taches.remove(tache);
    }

    public void vider() {
        taches.clear();
    }

    public void voirTaches() {
        for (Tache tache : taches) {
            System.out.println("\nTâche : " + tache.getLibelle());
            System.out.println("priorité : " + tache.getPriorite());
            System.out.println("date : " + tache.getDebut() + "\n");
        }
    }

    public void voirTachesRealiser() {
        for (Tache tache : taches) {
            if (tache.isTerminer())
                System.out.println("Tâche terminée : " + tache.getLibelle());
        }
    }

    public void voirTachesDate(Date date) {
        for (Tache tache : taches) {
            if (tache.getDebut().getYear() == date.getYear() &&
                    tache.getDebut().getMonth() == date.getMonth() &&
                    tache.getDebut().getDate() == date.getDate()) {
                System.out.println("Tâche ce jour-ci : " + tache.getLibelle());
            }
        }
    }

    // getters
    public List<Tache> getTaches() { return taches; }
}
