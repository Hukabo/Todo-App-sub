package com.subject.TodoApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoResponseDto {
    private long todoId;
    private String todo;
    private int orders;
    private boolean isComplete;
}
