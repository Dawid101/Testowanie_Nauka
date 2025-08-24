package pl.coderslab.week1.week1.cycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.coderslab.week1.week1.cycle.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;


    @BeforeEach
    void setUp() {
        task = new Task(1, "Cleaning", "Clean my room", "To do");
    }

    @Test
    void givenStatus_whenChangeStatus_thenCheckStatus() {
        task.changeStatus("In progress");
        assertEquals("In progress", task.getStatus());
    }

    @Test
    void completeTask() {
        task.completeTask();
        assertEquals("completed",task.getStatus());
    }

    @AfterEach
    void tearDown(){
        task = null;
    }
}