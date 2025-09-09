package pl.coderslab.week4.argument;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TaskSchedulerTest {

    @Test
    void testScheduleTask(){
        TaskExecutor mockTaskExecutor = mock(TaskExecutor.class);
        TaskScheduler taskScheduler = new TaskScheduler(mockTaskExecutor);

        List<Task> tasks = Arrays.asList(new Task("task1"),
                new Task("task2"),
                new Task("task3"));

        taskScheduler.scheduleTasks(tasks);

        ArgumentCaptor<Task> taskArgumentCaptor = ArgumentCaptor.forClass(Task.class);
        verify(mockTaskExecutor, times(tasks.size())).executeTask(taskArgumentCaptor.capture());
        List<Task> capturedTasks = taskArgumentCaptor.getAllValues();
        assertEquals(tasks.size(), capturedTasks.size());
        // Sprawdzenie, czy kolejność harmonogramowanych zadań jest zgodna z oczekiwaną kolejnością zadań wejściowych

        for (int i = 0; i < tasks.size(); i++) {
            assertEquals(tasks.get(i), capturedTasks.get(i));
        }

    }

}