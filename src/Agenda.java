import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    private List<Tache> taches;

    Agenda() {
        taches = new ArrayList<>();
    }

    public List<Tache> getTs() { return taches; }


    public void addT(Tache tache) {
        taches.add(tache);
    }

    public void addTs(List<Tache> taches) {
        this.taches = taches;
    }

    public void voir() {
        for (Tache tache : taches) {
            System.out.println("T: " + tache.getLib() + "// prio:    " + tache.getPrio()+ "//date: " + tache.getDebut() );
        }
    }


    public void voirRealiser() {
        for (Tache tache : taches) {
            if (tache.isFini())
                System.out.println(" La tache :" + tache.getLib() + " est finis !");
        }
    }


    public void voirDate(Date date) {
        for (Tache tache : taches) {
            if (tache.getDebut().getYear() == date.getYear() &&
                    tache.getDebut().getMonth() == date.getMonth() &&
                    tache.getDebut().getDate() == date.getDate()) {
                System.out.println("T à la date défini" + tache.getLib());
            }
        }
    }


}