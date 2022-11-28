package com.example.project.controller;


import com.example.project.Service.ProjectService;
import com.example.project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    @PostMapping("/save")
    public ResponseEntity<Project>createProject(@RequestBody Project project)  {
        projectService.addProject(project);
        return new ResponseEntity(HttpStatus.CREATED);
        
    }

    @GetMapping("/getproject/{projectId}")
    public List<Project> getProject(@RequestBody Project project){
        return this.projectService.getProject(project);

    }

    @DeleteMapping("/delete/{projectId}")
    public  ResponseEntity deleteProjectById(@PathVariable Long projectId){
        projectService.deleteProjectById(projectId);
        return new ResponseEntity(HttpStatus.OK);
    }



}
