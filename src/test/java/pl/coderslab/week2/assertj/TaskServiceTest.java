package pl.coderslab.week2.assertj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    void setUp(){
        taskService = new TaskService();
    }

    @Test
    void createTaskTest(){
        Task task = taskService.createTask(1L,"test","description test", Status.IN_PROGRESS);
        assertThat(task).isNotNull();
        assertThat(task.getTitle()).isEqualTo("test");
        assertThat(task.getDescription()).isEqualTo("description test");
        assertThat(task.getStatus()).isEqualTo(Status.IN_PROGRESS);
    }

    @Test
    void updateTaskTest(){
        Task task = taskService.createTask(1L,"test","description test", Status.IN_PROGRESS);
        Task updatedTask = taskService.updateTask(task.getTitle(), "This is an updated test task",Status.COMPLETED);
        assertThat(updatedTask).isNotNull();
        assertThat(updatedTask.getTitle()).isEqualTo("test");
        assertThat(updatedTask.getDescription()).isEqualTo("This is an updated test task");
        assertThat(updatedTask.getStatus()).isEqualTo(Status.COMPLETED);
    }

    @Test
    void deleteTaskTest(){
        Task task = taskService.createTask(1L,"test","description test", Status.IN_PROGRESS);
        taskService.deleteTask("test");
        assertThat(taskService.findTasks(null,null)).doesNotContain(task);
    }

    @Test
    public void testFindTasks() {
        Task task1 = taskService.createTask(1L,"Test task   1", "This is a test task   1", Status.IN_PROGRESS);
        Task task2 = taskService.createTask(2L,"Test task   2", "This is a test task   2", Status.COMPLETED);
        List<Task> tasks = taskService.findTasks(task1.getTitle(),task1.getStatus());
        assertThat(tasks).hasSize(1);
        assertThat(tasks.get(0).getTitle()).isEqualTo("Test task   1");
        tasks = taskService.findTasks(task2.getTitle(),task2.getStatus());
        assertThat(tasks).hasSize(1);
        assertThat(tasks.get(0).getStatus()).isEqualTo(Status.COMPLETED);
    }

    @Test
    public void testNullOrEmptyTitle(){
        assertThatThrownBy(() -> {
            taskService.createTask(1L,null,"description test", Status.IN_PROGRESS);
        }).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> {
           taskService.createTask(1L,"","description test", Status.IN_PROGRESS);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testTasksAreAddingToList(){
        Task task1 = taskService.createTask(1L, "test","description test", Status.IN_PROGRESS);
        Task task2 = taskService.createTask(2L, "tes2","description test2", Status.IN_PROGRESS);
        List<Task> tasks = taskService.getTasks();
        assertThat(tasks)
                .isNotEmpty()
                .hasSize(2)
                .containsAnyOf(task1,task2);
    }

    @Test
    public void testCreateDate(){
        Task task1 = taskService.createTask(1L, "test","description test", Status.IN_PROGRESS);
        LocalDate dateNow = LocalDate.now();
        assertThat(task1.getCreateDate()).isEqualTo(dateNow);
    }

}