package com.subject.TodoApp.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
public class TodoPostDto {
    @NotBlank(message = "공백은 안 됩니다.")
    private String todo;
    private int orders;
    private boolean isComplete = false;
}
