package pl.coderslab.week4.refactor;


import java.util.HashSet;
import java.util.Set;

public class TaskManager {
    Set<String> tasks = new HashSet<>();

    public void addTask(String task) {
        if (tasks.add(task)) {
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Task already exists.");
        }
    }

}
