package com.rizquierdo.test.taskmanagement.infraestructure.persistence.entity;

import com.rizquierdo.test.taskmanagement.domain.model.TaskStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document(collection = "tasks")
public class TaskEntity {

    @Id
    private String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private List<String> tags;
    private TaskStatus status = TaskStatus.PENDING;
}
