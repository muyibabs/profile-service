package com.muyi.rentcloud.profileservice.service;

import com.muyi.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer getById(Integer id);

    List<Customer> getAll();
}
