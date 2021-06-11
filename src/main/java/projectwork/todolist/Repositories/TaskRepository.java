package projectwork.todolist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import projectwork.todolist.Models.Task;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task getTaskById(Long id);
}
