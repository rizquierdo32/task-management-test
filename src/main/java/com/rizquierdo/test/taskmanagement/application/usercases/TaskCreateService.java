package com.rizquierdo.test.taskmanagement.application.usercases;

import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.CreateTaskDTO;

public interface TaskCreateService {

    String createTask(CreateTaskDTO createTaskDTO) ;
}
