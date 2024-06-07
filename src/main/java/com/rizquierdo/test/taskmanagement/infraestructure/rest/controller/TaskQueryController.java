package com.rizquierdo.test.taskmanagement.infraestructure.rest.controller;

import com.rizquierdo.test.taskmanagement.application.usercases.TaskQueryService;
import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskQueryController {

    private final TaskQueryService taskQueryService;

    @Autowired
    public TaskQueryController(TaskQueryService taskQueryService) {
        this.taskQueryService = taskQueryService;
    }

    @GetMapping("/list_all")
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        List<TaskDTO> tasks = taskQueryService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
}
