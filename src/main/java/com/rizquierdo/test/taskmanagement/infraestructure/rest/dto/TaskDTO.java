package com.rizquierdo.test.taskmanagement.infraestructure.rest.dto;

import com.rizquierdo.test.taskmanagement.domain.model.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private List<String> tags;
    private TaskStatus status;

}