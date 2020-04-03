package com.learn.jdbcconnection.rowmappers;

import com.learn.jdbconnection.models.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeNumber(resultSet.getInt("employeeNumber"));
        employee.setFirstName(resultSet.getString("firstName"));
        employee.setLastName(resultSet.getString("lastName"));
        employee.setExtension(resultSet.getString("extension"));
        employee.setOfficeCode(resultSet.getString("officeCode"));
        employee.setEmail(resultSet.getString("email"));
        employee.setJobTitle(resultSet.getString("jobTitle"));
        employee.setReportsTo(resultSet.getInt("reportsTo"));
        return employee;
    }









}
