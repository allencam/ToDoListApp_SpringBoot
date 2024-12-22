package com.allencam.ToDoListApp.data;

import java.util.List;

public interface TaskRepository {

    Task findByTaskId(int taskId);
    List<Task> findByUserId(int userId);
}
