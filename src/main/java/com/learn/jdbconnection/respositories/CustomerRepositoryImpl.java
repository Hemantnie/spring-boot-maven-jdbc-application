package com.learn.jdbconnection.respositories;

import com.learn.jdbcconnection.rowmappers.CustomerRowMapper;
import com.learn.jdbconnection.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    private CustomerRowMapper customerRowMapper = new CustomerRowMapper();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAll(){
        String sql = "select * from Customers";
        return this.jdbcTemplate.query(sql,customerRowMapper);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return null;
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer deleteCustomerById(Integer id) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }
}
