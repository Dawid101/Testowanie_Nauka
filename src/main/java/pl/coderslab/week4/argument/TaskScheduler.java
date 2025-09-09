package pl.coderslab.week4.argument;

import java.util.List;

public class TaskScheduler {
    private TaskExecutor taskExecutor;

    public TaskScheduler(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void scheduleTasks(List<Task> tasks) {
        for (Task task : tasks) {
            taskExecutor.executeTask(task);
        }
    }
}
