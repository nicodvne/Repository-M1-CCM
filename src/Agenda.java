import java.io.IOException;
import java.net.ServerSocket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Tache> taches;

    Agenda() {
        taches = new ArrayList<>();
    }

    Agenda(List<Tache> taches) {
        this.taches = taches;
    }

    public void addTache(Tache tache) {
        taches.add(tache);
    }

    public void addMultipleTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public void removeTache(Tache tache) {
        taches.remove(tache);
    }

    public void clear() {
        taches.clear();
    }


    public void viewTachesToday(LocalDateTime localDateTime)
    {
        for (Tache tache : taches)
        {
            if(tache.getDate().getYear() == localDateTime.getYear() && tache.getDate().getMonth() == localDateTime.getMonth() && tache.getDate().getDayOfWeek() == localDateTime.getDayOfWeek()){
                System.out.println("Tâches du jour: " + tache.getLibelle());
            }
        }
    }
    public void viewTachesEffectué()
    {
        for (Tache tache: taches)
        {
            if(tache.isEffectuee())
            {
                System.out.println("Tâche terminée : "+tache.getLibelle());
            }
        }
    }

    public void viewAllTaches()
    {
        for (Tache tache : taches)
        {
            System.out.println("Taches : " +tache.getLibelle());
            System.out.println("Prioritée : " +tache.getPriorite());
            System.out.println("Date : " +tache.getDate());
        }
    }

    public List<Tache> getTaches()
    {
        return taches;
    }


    public static void main(String args[])
    {
        Tache tache_1 = new Tache("Conduire", 1, LocalDateTime.now(), false);
        Tache tache_2 = new Tache("Manger", 2, LocalDateTime.now().plusHours(3), false);
        Tache tache_3 = new Tache("Dormir", 3, LocalDateTime.now().plusHours(8), false);
        Tache tache_4 = new Tache("Lever", 4, LocalDateTime.now().plusHours(16), false);
        Tache tache_5 = new Tache("Faire a manger", 5, LocalDateTime.now().plusHours(24), false);
        Tache tache_6 = new Tache("Ecole", 6, LocalDateTime.now().plusHours(48), false);
        Tache tache_7 = new Tache("RDV", 7, LocalDateTime.now().plusHours(72), false);
        Tache tache_8 = new Tache("Basket", 8, LocalDateTime.now().plusHours(96), false);

        Agenda agenda = new Agenda();
        agenda.addTache(tache_1);
        agenda.addTache(tache_2);
        agenda.addTache(tache_3);
        agenda.addTache(tache_4);
        agenda.addTache(tache_5);
        agenda.addTache(tache_6);
        agenda.addTache(tache_7);
        agenda.addTache(tache_8);

//        tache_2.setEffectuee(true);
//        agenda.viewTachesEffectué();
//        agenda.viewTachesToday(LocalDateTime.now());
//        agenda.viewAllTaches();

        Employe employe_1 = new Employe(agenda, "Bernard");
        Employe employe_2 = new Employe(agenda, "Romain");
        Employe employe_3 = new Employe(agenda, "Florentin");
        Employe employe_4 = new Employe(agenda, "Antoine");


        try{
            employe_1.start();
            employe_2.start();
            employe_1.join();
            employe_2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Fini");
    }
}
