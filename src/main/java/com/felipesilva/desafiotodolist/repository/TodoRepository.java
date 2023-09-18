package com.felipesilva.desafiotodolist.repository;

import com.felipesilva.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
