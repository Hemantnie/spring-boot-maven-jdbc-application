package com.learn.jdbconnection.controllers;

import com.learn.jdbconnection.models.Customer;
import com.learn.jdbconnection.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path="/customers")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Customer> getAllUsers() {
        return  customerService.getAll();
    }

}
