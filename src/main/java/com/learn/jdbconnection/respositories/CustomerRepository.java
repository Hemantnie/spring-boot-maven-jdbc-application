package com.learn.jdbconnection.respositories;

import com.learn.jdbconnection.models.Customer;

import java.util.List;

public interface CustomerRepository  {

    public List<Customer> getAll();

    public Customer getCustomerById(Integer id);

    public Customer addNewCustomer(Customer customer);

    public Customer deleteCustomerById(Integer id);

    public Customer updateCustomer(Customer customer);

}
