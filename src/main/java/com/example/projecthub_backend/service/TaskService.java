package com.example.projecthub_backend.service;

import com.example.projecthub_backend.model.Task;
import com.example.projecthub_backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setDescription(updatedTask.getDescription());
                    task.setStatus(updatedTask.getStatus());
                    task.setPriority(updatedTask.getPriority());
                    task.setAssignedTo(updatedTask.getAssignedTo());
                    task.setProject(updatedTask.getProject());
                    task.setDueDate(updatedTask.getDueDate());
                    task.setCreatedDate(updatedTask.getCreatedDate());
                    task.setCompletedDate(updatedTask.getCompletedDate());
                    task.setEstimatedHours(updatedTask.getEstimatedHours());
                    task.setActualHours(updatedTask.getActualHours());
                    task.setTags(updatedTask.getTags());
                    return taskRepository.save(task);
                })
                .orElseThrow(() -> new RuntimeException("Task not found with ID: " + id));
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
