package beans;

public class Employee {
    private int id;

    @Override
    public String toString() {
        return "Je suis l'employee " + id;
    }

    public Employee() {
        id = Main.getNbEmployee();
    }

    private Agenda agenda;

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }


}
