package com.rizquierdo.test.taskmanagement.infraestructure.mapper;

import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.CreateTaskDTO;
import com.rizquierdo.test.taskmanagement.infraestructure.rest.dto.TaskDTO;
import com.rizquierdo.test.taskmanagement.infraestructure.persistence.entity.TaskEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

  @Bean
  public ModelMapper modelMapper() {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
    modelMapper.typeMap(TaskEntity.class, CreateTaskDTO.class);
    modelMapper.typeMap(TaskEntity.class, TaskDTO.class);
    return modelMapper;
  }



}
