package com.rizquierdo.test.taskmanagement.application.service;

import com.rizquierdo.test.taskmanagement.application.usercases.TaskQueryService;
import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.TaskDTO;
import com.rizquierdo.test.taskmanagement.infraestructure.persistence.entity.TaskEntity;
import com.rizquierdo.test.taskmanagement.infraestructure.persistence.repository.TaskMongoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskQueryServiceImpl implements TaskQueryService {


    private final TaskMongoRepository taskMongoRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public TaskQueryServiceImpl(TaskMongoRepository taskMongoRepository,ModelMapper modelMapper) {
        this.taskMongoRepository = taskMongoRepository;
        this.modelMapper = modelMapper;

    }

    @Override
    public List<TaskDTO> getAllTasks() {
        List<TaskEntity> taskEntities = taskMongoRepository.findAll();
        return taskEntities.stream()
                .map(taskEntity -> modelMapper.map(taskEntity, TaskDTO.class))
                .collect(Collectors.toList());
    }
}