package com.example.springbootthymeleafemployemanager.repository;

import com.example.springbootthymeleafemployemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {


}
