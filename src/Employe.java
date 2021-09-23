public class Employe extends Thread{
    private Agenda agenda;
    private String nom;
    private boolean tacheEffectuee;

    public Employe(Agenda agenda, String nom)
    {
        this.agenda = agenda;
        this.nom = nom;
        tacheEffectuee = agenda.getTaches().isEmpty();
    }

    public void run()
    {
        System.out.println("Thread lancé");
        while (!tacheEffectuee)
        {
            try{
                sleep(2000);
                endTache();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                System.out.println("Erreur");
            }
        }
        System.out.println("Agenda fini, plus aucune tâches");
        System.out.println("Fin Employé " + this.nom);
    }

    private void endTache(){
        for (Tache tache :agenda.getTaches())
        {
            if(tache.isEffectuee() != true)
            {
                tache.setEffectuee(true);
                System.out.println(this.nom  + " Tache effectué: " + tache.getLibelle());
                return;
            }
        }
        tacheEffectuee = true;
    }
}
