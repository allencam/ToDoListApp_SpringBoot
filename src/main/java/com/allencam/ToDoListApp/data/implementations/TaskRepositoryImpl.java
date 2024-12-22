package com.allencam.ToDoListApp.data.implementations;

import com.allencam.ToDoListApp.data.TaskRepository;
import com.allencam.ToDoListApp.data.TaskRepositoryCustom;
import com.allencam.ToDoListApp.models.Task;

import java.util.List;

public class TaskRepositoryImpl implements TaskRepositoryCustom {

    @Override
    public List<Task> findByUserId(int userId) {
        return List.of();
    }

    @Override
    public List<Task> findByPriorityGreaterThan(int priority) {
        return List.of();
    }

    @Override
    public List<Task> findByPriorityLessThan(int priority) {
        return List.of();
    }

    @Override
    public void deleteByUserId(int userId) {

    }
}
