package pl.coderslab.week2.assertj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();


    public Task createTask(Long id, String title, String description, Status status) {
        Task task = new Task(id, title, description, status);
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
                .collect(Collectors.toList());
    }
}
