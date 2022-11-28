package com.example.project.Service;

import com.example.project.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public List<Employee>getEmployee(Employee employee);

    public Employee assignProjectToEmployee(Long empId, Long projectId);

    void deleteEmployeeById(Long empId);

    List<Employee> listAll();

}
