package com.example.projecthub_backend.service;
import com.example.projecthub_backend.model.Project;
import com.example.projecthub_backend.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Get all projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Get a single project by ID
    public Optional<Project> getProjectById(int id) {
        return projectRepository.findById(id);
    }

    // Create a new project
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    // Update an existing project
    public Project updateProject(int id, Project updatedProject) {
        Optional<Project> optional = projectRepository.findById(id);
        if (optional.isPresent()) {
            updatedProject.setId(id);
            return projectRepository.save(updatedProject);
        } else {
            throw new RuntimeException("Project with ID " + id + " not found.");
        }
    }

    // Delete a project (if you want this later)
    public void deleteProject(int id) {
        projectRepository.deleteById(id);
    }

}
