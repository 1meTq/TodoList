package projectwork.todolist.Services;

import projectwork.todolist.Models.Task;

import java.util.*;

public interface TaskService {

    Task addTask(Task list);

    Task updateTask(Task list);

    void deleteTask(Task task);

   Task getTask(Long id);

    List<Task> getAllTasks();
}
