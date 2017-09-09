package net.songpon.todo.repository;

import net.songpon.todo.domain.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
