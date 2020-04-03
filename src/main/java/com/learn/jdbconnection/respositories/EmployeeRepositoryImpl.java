package com.learn.jdbconnection.respositories;

import com.learn.jdbconnection.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    public List<Employee> getAll(){
        return null;
    }
}
