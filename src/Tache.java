import java.time.LocalDateTime;

public class Tache {
    private String libelle;
    private int priorite;
    private LocalDateTime date;
    public boolean effectuee;

    public Tache(String libelle, int priorite, LocalDateTime date, boolean effectuee){
        super();
        this.setLibelle(libelle);
        this.setPriorite(priorite);
        this.setDate(date);
        this.setEffectuee(effectuee);
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public int getPriorite() {
        return priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isEffectuee() {
        return effectuee;
    }

    public void setEffectuee(boolean effectuee) {
        this.effectuee = effectuee;
    }
}
