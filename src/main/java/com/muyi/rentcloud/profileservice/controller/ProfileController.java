package com.muyi.rentcloud.profileservice.controller;

import com.muyi.rentcloud.commons.model.Customer;
import com.muyi.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value = "/profile")
    public Customer save(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @GetMapping(value = "/profile/{id}")
    public Customer getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

    @GetMapping(value = "/profile")
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping(value = "/profilex")
    public CustomerList getAllCustomersAsOne(){
        List<Customer> all = customerService.getAll();
        CustomerList list = new CustomerList();
        list.setCustomers(all);
        return list;
    }
}
