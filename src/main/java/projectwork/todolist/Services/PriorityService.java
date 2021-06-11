package projectwork.todolist.Services;

import projectwork.todolist.Models.Priority;

public interface PriorityService {

    Priority addPriority(Priority priority);

    Priority updatePriority(Priority priority);

    void deletePriority(Long id);

}
