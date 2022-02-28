package com.example.springbootthymeleafemployemanager.service;


import com.example.springbootthymeleafemployemanager.model.Employee;


import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
}
