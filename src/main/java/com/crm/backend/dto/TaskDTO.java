package com.crm.backend.dto;

import com.crm.backend.model.Priority;
import com.crm.backend.model.TaskStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskDTO {
    private String title;
    private String description;
    private LocalDate dueDate;
    private Priority priority;
    private Long userId;
    private TaskStatus status;
}
