import java.time.LocalDateTime;
import java.util.Date;

public class Tache {
    private String lib;
    private Date debut;
    private int prio;
    private boolean fini;

    public Tache(String lib, int prio, Date debut) {
        this.lib = lib;
        this.debut = debut;
        this.prio = prio;
        fini = false;
    }

    public String getLib() { return lib; }
    public int getPrio() { return prio; }
    public boolean isFini() { return fini; }
    public Date getDebut() { return debut; }

    public void setLib(String lib) { this.lib = lib; }
    public void setPrio(int prio) { this.prio = prio; }
    public void setFini(boolean fini) { this.fini = fini; }
    public void setDebut(Date debut) { this.debut = debut; }

}