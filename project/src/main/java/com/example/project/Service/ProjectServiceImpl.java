package com.example.project.Service;


import com.example.project.entity.Project;
import com.example.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> getProject(Project project) {
        return projectRepo.findAll();
    }

    @Override
    public void deleteProjectById(Long projectId) {
        projectRepo.deleteById(projectId);
    }


}
