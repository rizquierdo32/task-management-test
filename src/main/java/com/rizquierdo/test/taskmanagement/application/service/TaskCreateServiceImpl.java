package com.rizquierdo.test.taskmanagement.application.service;

import com.rizquierdo.test.taskmanagement.application.usercases.TaskCreateService;
import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.CreateTaskDTO;
import com.rizquierdo.test.taskmanagement.infraestructure.persistence.entity.TaskEntity;
import com.rizquierdo.test.taskmanagement.infraestructure.persistence.repository.TaskMongoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCreateServiceImpl implements TaskCreateService {

    private final TaskMongoRepository taskMongoRepository;

    private final ModelMapper modelMapper;


    @Autowired
    public TaskCreateServiceImpl(TaskMongoRepository taskMongoRepository, ModelMapper modelMapper) {
        this.taskMongoRepository = taskMongoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public String createTask(CreateTaskDTO createTaskDTO) {
        TaskEntity taskEntity = modelMapper.map(createTaskDTO, TaskEntity.class);
        TaskEntity savedEntity = taskMongoRepository.save(taskEntity);
        return savedEntity.getId();
    }
}
