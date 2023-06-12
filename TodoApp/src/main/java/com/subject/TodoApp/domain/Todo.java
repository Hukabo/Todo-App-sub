package com.subject.TodoApp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Todo {
    private long todoId;
    private String todo;
    private int orders;
    private boolean isComplete;
}