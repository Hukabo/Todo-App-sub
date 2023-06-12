package com.subject.TodoApp.mapper;

import com.subject.TodoApp.domain.Todo;
import com.subject.TodoApp.dto.TodoPostDto;
import com.subject.TodoApp.dto.TodoResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-12T17:42:45+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Azul Systems, Inc.)"
)
@Component
public class TodoMapperImpl implements TodoMapper {

    @Override
    public Todo todoPostDtoToTodo(TodoPostDto todoPostDto) {
        if ( todoPostDto == null ) {
            return null;
        }

        Todo todo = new Todo();

        todo.setTodo( todoPostDto.getTodo() );
        todo.setOrders( todoPostDto.getOrders() );

        return todo;
    }

    @Override
    public TodoResponseDto todoToTodoResponseDto(Todo todo) {
        if ( todo == null ) {
            return null;
        }

        TodoResponseDto todoResponseDto = new TodoResponseDto();

        todoResponseDto.setTodoId( todo.getTodoId() );
        todoResponseDto.setTodo( todo.getTodo() );
        todoResponseDto.setOrders( todo.getOrders() );

        return todoResponseDto;
    }
}
