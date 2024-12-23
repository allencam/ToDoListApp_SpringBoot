package com.allencam.ToDoListApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String title;

    private String description;

    private int priority;

    private String deadline;

    public Task() {}

    public Task(int taskId, User user, String title, String description, int priority, String deadline) {
        this.taskId = taskId;
        this.user = user;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
               "taskId=" + taskId +
               ", user_id=" + user +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", priority=" + priority +
               ", deadline=" + deadline +
               '}';
    }
}
