package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
    public List<Todo> findByUsername(String username);

}
