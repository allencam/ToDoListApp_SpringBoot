package com.allencam.ToDoListApp.data;

import com.allencam.ToDoListApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {
    // All basic CRUD operations are automatically available

    @Query("SELECT t FROM Task t WHERE taskId = :task_id")
    Task getById(@Param("task_id") int id);
}