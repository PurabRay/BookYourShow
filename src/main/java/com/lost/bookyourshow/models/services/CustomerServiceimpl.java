package com.lost.bookyourshow.models.services;

import com.lost.bookyourshow.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceimpl implements CustomerService{

    CustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list=new ArrayList<>();
        list=customerRepository.findAll();
        return list;
    }

    @Override
    public Customer getCostumerById(Long id) {
       Customer customer=new Customer();

    }
}


