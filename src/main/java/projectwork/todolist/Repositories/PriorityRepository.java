package projectwork.todolist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import projectwork.todolist.Models.Priority;

@Repository
@Transactional
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
