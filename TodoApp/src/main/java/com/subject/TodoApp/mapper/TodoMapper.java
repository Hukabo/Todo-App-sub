package com.subject.TodoApp.mapper;

import com.subject.TodoApp.domain.Todo;
import com.subject.TodoApp.dto.TodoPostDto;
import com.subject.TodoApp.dto.TodoResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    Todo todoPostDtoToTodo(TodoPostDto todoPostDto);
    TodoResponseDto todoToTodoResponseDto(Todo todo);
}
