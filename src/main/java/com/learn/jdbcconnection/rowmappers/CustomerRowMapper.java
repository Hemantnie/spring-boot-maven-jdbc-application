package com.learn.jdbcconnection.rowmappers;

import com.learn.jdbconnection.models.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Customer customer = new Customer();
        customer.setCustomerNumber(resultSet.getInt("customerNumber"));
        customer.setCustomerName(resultSet.getString("customerName"));
        customer.setContactFirstName(resultSet.getString("contactFirstName"));
        customer.setContactLastName(resultSet.getString("contactLastName"));
        customer.setPhone(resultSet.getString("phone"));
        customer.setAddressLine1(resultSet.getString("addressLine1"));
        customer.setAddressLine2(resultSet.getString("addressLine2"));
        customer.setCity(resultSet.getString("city"));
        customer.setState(resultSet.getString("state"));
        customer.setPostalCode(resultSet.getString("postalCode"));
        customer.setCountry(resultSet.getString("country"));
        customer.setSalesRepEmployeeNumber(resultSet.getInt("salesRepEmployeeNumber"));
        customer.setCreditLimit(resultSet.getDouble("creditLimit"));
        return customer;
    }
}
