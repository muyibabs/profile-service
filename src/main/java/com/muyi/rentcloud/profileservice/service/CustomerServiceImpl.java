package com.muyi.rentcloud.profileservice.service;

import com.muyi.rentcloud.commons.model.Customer;
import com.muyi.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer getById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
