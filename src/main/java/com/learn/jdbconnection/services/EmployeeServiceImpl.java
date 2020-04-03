package com.learn.jdbconnection.services;

import com.learn.jdbconnection.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private CustomerRepository customerRepository;
}
