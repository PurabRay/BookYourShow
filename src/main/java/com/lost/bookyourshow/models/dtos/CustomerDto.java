package com.lost.bookyourshow.models.dtos;

import com.lost.bookyourshow.models.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    private Long id;
    private String name;
    private String email;
    Customer customer=new Customer();
    CustomerDto(){
        this.id=customer.getId();
        this.name= customer.getName();
        this.email=customer.getEmail();
    }

}
