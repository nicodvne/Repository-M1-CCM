package beans;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Task> listOfTasks = new LinkedList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        listOfTasks.forEach(stringBuilder::append);
        return "list of tasks :\n\n"  + stringBuilder.toString();
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public List<Task> getDoneTasks() {
        return listOfTasks.stream().filter(Task::isDone).collect(Collectors.toList());
    }

    public List<Task> getTaskByDate(LocalDateTime dateTime) {
        return listOfTasks.stream().filter(task -> task.getStart_date() == dateTime).collect(Collectors.toList());
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

}
