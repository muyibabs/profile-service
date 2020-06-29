package com.muyi.rentcloud.profileservice.controller;

import com.muyi.rentcloud.commons.model.Customer;

import java.util.List;

public class CustomerList {

    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
