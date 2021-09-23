package Intro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import static java.util.stream.Collectors.toCollection;

public class Agenda {
    ArrayList<Tache> tasks;

    public Agenda() {
        setTasks(new ArrayList());
    }

    public Agenda(ArrayList<Tache> tasks) {
        setTasks(tasks);
    }

    public ArrayList<Tache> getTasksCompleted() {
        return tasks.stream().filter(c -> !c.isEffectuee()).collect(toCollection(ArrayList::new));
    }

    public ArrayList<Tache> getTaskForDate(Date date) {
        return tasks.stream().filter(task -> task.getDebut().equals(date)).collect(toCollection(ArrayList::new));
    }

    public ArrayList<Tache> getTasks() {
        Comparator<Tache> comparateurTaches = (t1, t2) -> t1.getDebut().compareTo(t2.getDebut());
        return tasks.stream().sorted(comparateurTaches).collect(toCollection(ArrayList::new));
    }

    public void setTasks(ArrayList<Tache> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "taches={" + tasks +
                "}";
    }
}