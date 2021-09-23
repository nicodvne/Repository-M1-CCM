import java.time.LocalDateTime;
import java.util.Date;

public class main {
    public static void main(String args[]) {
        Tache tache1 = new Tache("RDV Véto", 1,  new Date(2022, 7, 25));
        Tache tache2 = new Tache("Cours", 2, new Date(2022, 2, 20));
        Tache tache3 = new Tache("Natation", 3, new Date(2022, 12, 25));
        Tache tache4 = new Tache("Kiné", 3, new Date(2022, 12, 25));

        Tache tache7 = new Tache("Cours math", 2, new Date(2022, 2, 20));
        Tache tache8 = new Tache("foot", 3, new Date(2022, 12, 25));
        Tache tache9 = new Tache("RDV ", 3, new Date(2022, 12, 25));


        Agenda agenda = new Agenda();
        Agenda agenda2 = new Agenda();


        tache2.setFini(true);
                agenda.addT(tache1);
                agenda.addT(tache2);
                agenda.addT(tache3);

        agenda2.addT(tache7);
        agenda2.addT(tache8);
        agenda2.addT(tache9);


        agenda.voir();
        agenda.voirRealiser();
        agenda.voirDate( new Date(2022, 2, 20));

        Emp emp1 = new Emp(agenda,"Brigitte");
        Emp emp3 = new Emp(agenda,"Jacques");
        Emp emp2 = new Emp(agenda2,"Emmanuel");

        try {
            emp1.start();
            emp2.start();
            emp3.start();
            emp1.join();
            emp2.join();
            emp3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
