package com.example.project.Service;

import com.example.project.entity.Employee;
import com.example.project.entity.Project;
import com.example.project.repository.EmployeeRepository;
import com.example.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements   EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public Employee addEmployee(Employee employee) {

        employeeRepo.save(employee);

        return employee;
    }
    @Override
    public List<Employee> getEmployee(Employee employee) {
        return employeeRepo.findAll();
    }
    @Override
    public Employee assignProjectToEmployee(Long empId, Long projectId) {
        Set<Project> projectSet=null;
        Employee employee = employeeRepo.findById(empId).get();
        Project project = projectRepo.findById(projectId).get();

        projectSet = employee.getAssignedProjects();
        projectSet.add(project);
        employee.setAssignedProjects(projectSet);

         return employeeRepo.save(employee);

    }

    @Override
    public void deleteEmployeeById(Long empId) {
        employeeRepo.deleteById(empId);
    }

    @Override
    public List<Employee> listAll() {
        return employeeRepo.findAll();
    }


}
