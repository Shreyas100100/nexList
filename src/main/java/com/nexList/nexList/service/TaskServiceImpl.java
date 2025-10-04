package com.nexList.nexList.service;

import com.nexList.nexList.model.Task;
import com.nexList.nexList.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;
    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task) {
        Task updatedTask = taskRepository.save(task);
        return updatedTask;
    }

    @Override
    public void deleteTask(String taskId) {
        taskRepository.deleteById(taskId);
    }
}
