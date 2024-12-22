package com.allencam.ToDoListApp.data;

import com.allencam.ToDoListApp.models.Task;

import java.util.List;

public interface TaskRepositoryCustom {

    List<Task> findByUserId(int userId);
    List<Task> findByPriorityGreaterThan(int priority);
    List<Task> findByPriorityLessThan(int priority);
    void deleteByUserId(int userId); // Will need to be careful with how this is implemented, only admin should be able to do this

}
