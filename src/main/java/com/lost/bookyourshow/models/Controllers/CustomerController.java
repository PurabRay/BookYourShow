package com.lost.bookyourshow.models.Controllers;

import com.lost.bookyourshow.models.Customer;
import com.lost.bookyourshow.models.dtos.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();  // Call to service
        List<CustomerDto> dtos = new ArrayList<>();
        for (Customer customer : customers) {
            ((ArrayList<CustomerDto>) dtos).add(convertCustomerToDto(customer));  // Mapping logic
        }
        return ResponseEntity.ok(dtos);
    }

    // Optional: Method for mapping a Customer to a CustomerDto (replace with mapping library if needed)
    private CustomerDto convertCustomerToDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        // ... Map other relevant fields from Customer to CustomerDto
        return dto;
    }
}
