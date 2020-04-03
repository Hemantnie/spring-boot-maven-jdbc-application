package com.learn.jdbconnection.services;

import com.learn.jdbconnection.models.Customer;
import com.learn.jdbconnection.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }
}
