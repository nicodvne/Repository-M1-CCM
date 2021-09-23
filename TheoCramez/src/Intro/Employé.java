package Intro;

public class Employé {
    private Agenda agenda;

    public Employé(Agenda agenda) {
        this.agenda = agenda;
    }

    public Employé() {
        this.agenda = new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Employé{" +
            "agenda:{" + agenda +
            "}}";
    }
}