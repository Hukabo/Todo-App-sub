package com.subject.TodoApp.service;

import com.subject.TodoApp.domain.Todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public Todo createTodo(Todo todo) {
        return todo;
    }
}
