package com.rizquierdo.test.taskmanagement.infraestructure.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class CreateTaskDTO {

    @NotBlank(message = "The title cannot be blank")
    private String title;

    @NotBlank(message = "The description cannot be blank")
    private String description;

    @NotNull(message = "The due date cannot be null")
    @FutureOrPresent(message = "The due date must be in the future or present")
    private LocalDate dueDate;

    private List<String> tags;

}
