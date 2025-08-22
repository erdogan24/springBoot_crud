package com.springCrudDemo.cruddemo.rest;


import com.springCrudDemo.cruddemo.dao.EmployeeDAO;
import com.springCrudDemo.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeRestController {

    private EmployeeDAO employeeDao;

    // quick and dirty : inject employee dao ( use constructor injection)

    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDao = theEmployeeDAO;
    }

    // expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDao.findAll();

    }
}
