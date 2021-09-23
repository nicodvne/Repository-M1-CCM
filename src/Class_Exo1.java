import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Class_Exo1 {


    protected int Valeur = 0;
    private float[] notes = new float[5];

    public Class_Exo1(){
        System.out.println("Resultat Constructeur = " + this.getValeur());
        this.setValeur(10);
        System.out.println("Resultat getValeur après setValeurs = " + this.getValeur());

//        this.addPropertyChangeListener( new PropertyChangeListener(){
//            public void propertyChange(PropertyChangeEvent event)
//            {
//                System.out.println("PropertyChangeEvent -> Changement de valeur = " + event.getNewValue());
//            }
//        });
    }

//    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)

    public int getValeur() {
        return Valeur;
    }

    public void setValeur(int valeur) {
        Valeur = valeur;
    }


    public float[] getNotes() {
        return notes;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public static void main(String[] args)
    {
        new Class_Exo1();
    }
}
