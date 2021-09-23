package beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LaClasseEnJava {

    private String monAttributAEncapsuler;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);


    public String getMonAttributAEncapsuler() {
        return monAttributAEncapsuler;
    }

    public void setMonAttributAEncapsuler(String newValue) {
        String oldValue = this.monAttributAEncapsuler;
        this.monAttributAEncapsuler = newValue;
        this.pcs.firePropertyChange("monAttributAEncapsuler", oldValue, newValue);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    public void setValue(String newValue) {

    }


}
