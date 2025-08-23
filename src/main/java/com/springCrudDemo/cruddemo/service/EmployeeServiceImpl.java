package com.springCrudDemo.cruddemo.service;

import com.springCrudDemo.cruddemo.dao.EmployeeDAO;
import com.springCrudDemo.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeDAO employeeDAO;


    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}