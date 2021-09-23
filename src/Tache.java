import java.util.Date;

public class Tache {
    private String libelle;
    private int priorite;
    private Date debut;
    private boolean terminer;

    public Tache(String libelle, int priorite, Date debut) {
        this.libelle = libelle;
        this.priorite = priorite;
        this.debut = debut;
        terminer = false;
    }

    // Getters
    public String getLibelle() { return libelle; }
    public int getPriorite() { return priorite; }
    public Date getDebut() { return debut; }
    public boolean isTerminer() { return terminer; }

    // Setters
    public void setLibelle(String libelle) { this.libelle = libelle; }
    public void setPriorite(int priorite) { this.priorite = priorite; }
    public void setDebut(Date debut) { this.debut = debut; }
    public void setTerminer(boolean terminer) { this.terminer = terminer; }
}
