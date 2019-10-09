package com.example.demo.api;

import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerAPI {

    private CustomerService customerService;

    public CustomerAPI(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public void addCustomer(@RequestBody CustomerDto customerDto) {
        customerService.addCustomer(customerDto);
    }
}
