package projectwork.todolist.Services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectwork.todolist.Models.Priority;
import projectwork.todolist.Repositories.PriorityRepository;
import projectwork.todolist.Services.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public Priority addPriority(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public Priority updatePriority(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public void deletePriority(Long id) {
        priorityRepository.deleteById(id);
    }
}
