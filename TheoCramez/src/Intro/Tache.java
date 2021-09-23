package Intro;
import java.time.*;

public class Tache {
    public Tache(String p_libelle, short p_priorite) {
        this.libelle = p_libelle;
        this.priorite = p_priorite;
        this.debut = LocalDateTime.now();
        this.effectuee = false;
    }

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String p_libelle) {
        this.libelle = p_libelle;
    }
    private String libelle;

    public short getPriorite() {
        return priorite;
    }
    public void setPriorite(short p_priorite) {
        this.priorite = p_priorite;
    }
    private short priorite;

    public LocalDateTime getDebut() {
        return debut;
    }
    public void setDebut(LocalDateTime p_debut) {
        this.debut = p_debut;
    }
    private LocalDateTime debut;

    public boolean isEffectuee() {
        return effectuee;
    }
    public void setEffectuee(boolean p_effectuee) {
        this.effectuee = p_effectuee;
    }
    private boolean effectuee;

    @Override
    public String toString() {
        return "Tache{" +
                "libelle='" + libelle + '\'' +
                ", priorite=" + priorite +
                ", debut=" + debut +
                ", effectuee=" + effectuee +
                '}';
    }
}