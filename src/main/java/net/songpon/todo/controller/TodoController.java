package net.songpon.todo.controller;

import net.songpon.todo.domain.Todo;
import net.songpon.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 */
@RestController
public class TodoController {

    private TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/ping")
    public String ping() {
        return "pong!";
    }

    @PostMapping("/todos")
    public ResponseEntity<?> createTodo(@RequestBody Todo todo) {
        Todo createdTodo = repository.save(todo);

        return ResponseEntity.created(ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdTodo.getId()).toUri()).build();
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<?> getTodo(@PathVariable Long id) {
        Todo todo = repository.findOne(id);

        return ResponseEntity.ok(todo);
    }

    @GetMapping("/todos")
    public ResponseEntity<?> listTodos() {
        Iterable<Todo> todos = repository.findAll();
        return ResponseEntity.ok(todos);
    }
}
