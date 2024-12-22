package com.allencam.ToDoListApp.data;

import com.allencam.ToDoListApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {
    // All basic CRUD operations are automatically available
}
