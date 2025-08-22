package com.springCrudDemo.cruddemo.dao;

import com.springCrudDemo.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
