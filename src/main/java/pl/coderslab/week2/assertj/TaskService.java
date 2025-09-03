package pl.coderslab.week2.assertj;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();


    public Task createTask(Long id, String title, String description, Status status) {
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        Task task = new Task(id, title, description, status);
        task.setCreateDate(LocalDate.now());
        tasks.add(task);
        return task;
    }

    public Task updateTask(String title, String description, Status status) {
        Task task = tasks.stream()
                .filter(t -> t.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (task != null) {
            task.setTitle(title);
            task.setDescription(description);
            task.setStatus(status);
        }
        return task;
    }

    public void deleteTask(String title) {
        tasks.removeIf(t -> t.getTitle().equals(title));
    }

    public List<Task> findTasks(String title, Status status) {
        return tasks.stream()
                .filter(t -> title == null || t.getTitle().contains(title))
                .filter(t -> status == null || t.getStatus().equals(status))
                .toList();
    }

    public List<Task> searchTasksByDate(LocalDate date){
        return tasks.stream()
                .filter(d -> d.getCreateDate().equals(date))
                .toList();
    }

    public List<Task> getTasks(){
        return tasks;
    }
}
