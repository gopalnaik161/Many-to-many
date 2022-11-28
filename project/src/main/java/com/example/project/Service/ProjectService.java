package com.example.project.Service;

import com.example.project.entity.Project;

import java.util.List;

public interface ProjectService {

    public Project addProject(Project project);


    public List<Project> getProject(Project project);


    void deleteProjectById(Long projectId);
}
