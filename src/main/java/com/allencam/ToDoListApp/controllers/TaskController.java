package com.allencam.ToDoListApp.controllers;

import com.allencam.ToDoListApp.data.TaskRepository;
import com.allencam.ToDoListApp.data.TaskRepositoryCustom;
import com.allencam.ToDoListApp.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;
    private TaskRepositoryCustom taskRepositoryCustom;

    @Autowired
    public TaskController(TaskRepository taskRepository, TaskRepositoryCustom taskRepositoryCustom) {
        this.taskRepository = taskRepository;
        this.taskRepositoryCustom = taskRepositoryCustom;
    }

    @GetMapping
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        taskRepository.deleteById(id);
    }
}
