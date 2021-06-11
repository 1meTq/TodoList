package projectwork.todolist.Services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectwork.todolist.Models.Task;
import projectwork.todolist.Repositories.TaskRepository;
import projectwork.todolist.Services.TaskService;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task addTask(Task list) {
        return taskRepository.save(list);
    }

    @Override
    public Task updateTask(Task list) {
        return taskRepository.save(list);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }

    @Override
    public Task getTask(Long id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
