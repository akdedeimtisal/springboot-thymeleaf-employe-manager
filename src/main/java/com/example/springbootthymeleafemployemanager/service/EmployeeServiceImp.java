package com.example.springbootthymeleafemployemanager.service;

import com.example.springbootthymeleafemployemanager.model.Employee;
import com.example.springbootthymeleafemployemanager.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = Optional.of(employeeRepository.getById(id));
        Employee employee = null;
        if(optional.isPresent()) {
            employee = optional.get();

        }
        else {
            throw new RuntimeException("Employee not found for id " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        this.employeeRepository.deleteById(id);
    }
}
