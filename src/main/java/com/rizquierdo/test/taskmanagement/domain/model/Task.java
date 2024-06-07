package com.rizquierdo.test.taskmanagement.domain.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Task {
    private String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private List<String> tags;
    private TaskStatus status;

}
