package com.muyi.rentcloud.profileservice.controller;

import com.muyi.rentcloud.commons.model.Customer;
import com.muyi.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value = "/profile")
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @GetMapping(value = "/profile/{id}")
    public Customer getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

    @GetMapping(value = "/profile")
    @PreAuthorize("hasRole('ROLE_operator')") //Only user with this role can access
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping(value = "/profilex")
    @PreAuthorize("hasAuthority('read_profile')")
    public CustomerList getAllCustomersAsOne(){
        List<Customer> all = customerService.getAll();
        CustomerList list = new CustomerList();
        list.setCustomers(all);
        return list;
    }
}
