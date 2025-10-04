package com.nexList.nexList.service;

import com.nexList.nexList.model.Task;

import java.util.List;

public interface TaskService {
    // CRUD
    Task createTask(Task task);
    List<Task> getTask();
    Task updateTask(Task task);
    void deleteTask(String taskId);
}
