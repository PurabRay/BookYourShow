package com.lost.bookyourshow.models.services;

import com.lost.bookyourshow.models.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCostumerById();

}
