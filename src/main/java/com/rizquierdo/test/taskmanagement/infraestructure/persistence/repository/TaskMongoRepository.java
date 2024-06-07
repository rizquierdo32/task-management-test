package com.rizquierdo.test.taskmanagement.infraestructure.persistence.repository;

import com.rizquierdo.test.taskmanagement.infraestructure.persistence.entity.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskMongoRepository extends MongoRepository<TaskEntity, String>  {
}
