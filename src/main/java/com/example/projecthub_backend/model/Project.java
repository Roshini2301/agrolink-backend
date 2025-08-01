package com.example.projecthub_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String status;
    private String priority;
    private int progress;
    private LocalDate startDate;
    private LocalDate endDate;
    private double budget;
    private int teamSize;
    private String manager;
    private String client;

    private int tasksTotal;
    private int tasksCompleted;
    private int tasksInProgress;
    private int tasksPending;

    // Getters and Setters (Generated or manually written)

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public int getProgress() { return progress; }
    public void setProgress(int progress) { this.progress = progress; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }

    public String getClient() { return client; }
    public void setClient(String client) { this.client = client; }

    public int getTasksTotal() { return tasksTotal; }
    public void setTasksTotal(int tasksTotal) { this.tasksTotal = tasksTotal; }

    public int getTasksCompleted() { return tasksCompleted; }
    public void setTasksCompleted(int tasksCompleted) { this.tasksCompleted = tasksCompleted; }

    public int getTasksInProgress() { return tasksInProgress; }
    public void setTasksInProgress(int tasksInProgress) { this.tasksInProgress = tasksInProgress; }

    public int getTasksPending() { return tasksPending; }
    public void setTasksPending(int tasksPending) { this.tasksPending = tasksPending; }
}
