package com.laurentcusimano.s2;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class Agenda {
    private ArrayList<Task> tasks = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public ArrayList<Task> getDoneTasks(){
        return this.tasks.stream().filter(Task::isDone).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Task> getTasksAtDate(Date date){
        return this.tasks.stream().filter(task -> task.getStart().equals(date)).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String toString() {

        return tasks.stream()
                .map(Task::toString)
                .collect(Collectors.joining("\n"));
    }
}
