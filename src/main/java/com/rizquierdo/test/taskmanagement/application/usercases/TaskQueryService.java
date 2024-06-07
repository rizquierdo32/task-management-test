package com.rizquierdo.test.taskmanagement.application.usercases;

import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.TaskDTO;

import java.util.List;

public interface TaskQueryService {
    List<TaskDTO> getAllTasks();
}
