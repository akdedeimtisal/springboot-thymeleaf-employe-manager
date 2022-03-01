package com.example.springbootthymeleafemployemanager.service;


import com.example.springbootthymeleafemployemanager.model.Employee;


import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployee(long id);
}
