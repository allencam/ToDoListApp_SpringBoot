package com.allencam.ToDoListApp.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private int user_id;

    @Column(nullable = false)
    private String title;

    private String description;

    private int priority;

    private LocalDateTime deadline;

    public Task() {}

    public Task(int task_id, int user_id, String title, String description, int priority, LocalDateTime deadline) {
        this.task_id = task_id;
        this.user_id = user_id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
               "task_id=" + task_id +
               ", user_id=" + user_id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", priority=" + priority +
               ", deadline=" + deadline +
               '}';
    }
}
