package pl.coderslab.week1.cycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    private TaskManager taskManager;

    @BeforeEach
    void setTaskManager() {
        taskManager = new TaskManager();
    }

    @Test
    void testAddTask() {
        Task task = new Task(1, "Cleaning", "Clean my room", "To do");
        taskManager.addTask(task);
        assertTrue(taskManager.getTasks().contains(task));
    }

    @Test
    void testRemoveExistingTaskById() {
        Task task = new Task(1, "Cleaning", "Clean my room", "To do");
        taskManager.addTask(task);
        assertTrue(taskManager.removeTaskById(1));
        assertFalse(taskManager.getTasks().contains(task));
    }

    @Test
    void testRemoveNonExistingTaskById() {
        assertFalse(taskManager.removeTaskById(2));
    }

    @Test
    void testChangeExistingTaskStatus() {
        Task task = new Task(1, "Cleaning", "Clean my room", "To do");
        taskManager.addTask(task);
        taskManager.changeTaskStatus(1, "In progress");
        assertEquals("In progress", task.getStatus());
    }

    @Test
    void testChangeNonExistingTaskStatus() {
        Task task = new Task(1, "Cleaning", "Clean my room", "To do");
        taskManager.addTask(task);
        taskManager.changeTaskStatus(5, "In progress");
        assertEquals("To do", taskManager.getTasks().get(0).getStatus());
    }

    @AfterEach
    void tearDown(){
        taskManager = null;
    }
}