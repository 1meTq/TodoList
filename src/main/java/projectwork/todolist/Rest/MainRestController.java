package projectwork.todolist.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projectwork.todolist.Models.Task;
import projectwork.todolist.Services.PriorityService;
import projectwork.todolist.Services.TaskService;

import java.util.*;

@RestController
@RequestMapping(value = "/api")
public class MainRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<?> getTasks() {

        List<Task> tasksList = taskService.getAllTasks();

        return ((tasksList != null) ? ResponseEntity.ok(tasksList) : (ResponseEntity<?>) ResponseEntity.badRequest());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addTask(@RequestBody Task task) {


        if (task.getPriority() != null && task.getPriority().getId() != null) {
            if (task.getName() != null && task.getName() != "") {
                if (task.getDate() != null && task.getDate() != "") {
                    return ResponseEntity.ok(taskService.addTask(task));
                }
            }
        }

        return (ResponseEntity<?>) ResponseEntity.badRequest();
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateTask(@RequestBody Task task) {

        Task updatedTask = taskService.getTask(task.getId());


        updatedTask.setName(task.getName());
        updatedTask.setDate(task.getDate());
        updatedTask.setDescription(task.getDescription());
        updatedTask.setIsDone(task.getIsDone());
        updatedTask.setPriority(task.getPriority());

        if (task.getPriority() != null && task.getPriority().getId() != null) {
            if (task.getName() != null && task.getName() != "") {
                if (task.getDate() != null && task.getDate() != "") {
                    return ResponseEntity.ok(taskService.updateTask(task));
                }
            }
        }

        return (ResponseEntity<?>) ResponseEntity.badRequest();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable(name = "id")Long id) {

        Task task = taskService.getTask(id);

        if (task != null) {
            taskService.deleteTask(task);
            return ResponseEntity.ok(true);
        }
        return (ResponseEntity<?>) ResponseEntity.badRequest();
    }


}
