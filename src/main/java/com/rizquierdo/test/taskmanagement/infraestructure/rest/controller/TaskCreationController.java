package com.rizquierdo.test.taskmanagement.infraestructure.rest.controller;

import com.rizquierdo.test.taskmanagement.application.usercases.TaskCreateService;
import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.CreateTaskDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@Validated
public class TaskCreationController {

    private final TaskCreateService taskCreateService;

    @Autowired
    public TaskCreationController(TaskCreateService taskCreateService) {
        this.taskCreateService = taskCreateService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createTask(@Valid @RequestBody CreateTaskDTO createTaskDTO) {
        return new ResponseEntity<>( taskCreateService.createTask(createTaskDTO), HttpStatus.CREATED);
    }
}
