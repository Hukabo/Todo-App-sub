package com.subject.TodoApp.controller;

import com.subject.TodoApp.domain.Todo;
import com.subject.TodoApp.dto.TodoPostDto;
import com.subject.TodoApp.mapper.TodoMapper;
import com.subject.TodoApp.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class TodoController {
    private final TodoService todoService;
    private final TodoMapper mapper;

    public TodoController(TodoService todoService, TodoMapper mapper) {
        this.todoService = todoService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postTodo(@Valid @RequestBody TodoPostDto todoPostDto) {
        Todo todo = mapper.todoPostDtoToTodo(todoPostDto);

        Todo createdTodo = todoService.createTodo(todo);


        return new ResponseEntity(mapper.todoToTodoResponseDto(createdTodo), HttpStatus.CREATED);
    }
}
