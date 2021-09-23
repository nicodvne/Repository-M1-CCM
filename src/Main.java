import java.util.Date;

public class Main {
    public static void main(String args[]) {
        Tache tache1 = new Tache("Alex est recruté", 1, new Date(2020, 5, 10));
        Tache tache2 = new Tache("Alex travaille", 2, new Date(2021, 9, 20));
        Tache tache3 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));
        Tache tache4 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));
        Tache tache5 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));
        Tache tache6 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));
        Tache tache7 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));
        Tache tache8 = new Tache("Alex est viré", 3, new Date(2022, 9, 25));

        Agenda agenda = new Agenda();
        agenda.ajouterTache(tache1);
        agenda.ajouterTache(tache2);
        agenda.ajouterTache(tache3);
        agenda.ajouterTache(tache4);
        agenda.ajouterTache(tache5);
        agenda.ajouterTache(tache6);
        agenda.ajouterTache(tache7);
        agenda.ajouterTache(tache8);

        Employe employe1 = new Employe(agenda);
        Employe employe2 = new Employe(agenda);
        Employe employe3 = new Employe(agenda);
        Employe employe4 = new Employe(agenda);

        try {
            employe1.start();
            employe2.start();
            employe3.start();
            employe4.start();

            employe1.join();
            employe2.join();
            employe3.join();
            employe4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin du programme");
    }
}
