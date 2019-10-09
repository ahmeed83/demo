package com.example.demo.service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerDto> getAllCustomer() {
        List<CustomerDto> customerDtos = new ArrayList<>();
        customerRepository.findAll().forEach(customerEntity ->
                customerDtos.add(CustomerDto.builder()
                        .firstName(customerEntity.getFirstName()).lastName(customerEntity.getLastName())
                        .age(customerEntity.getAge()).address(customerEntity.getAddress())
                        .build()));
        return customerDtos;
    }

    public void addCustomer(final CustomerDto customerDto) {
        customerRepository.save(
                CustomerEntity.builder()
                        .firstName(customerDto.getFirstName()).lastName(customerDto.getLastName())
                        .address(customerDto.getAddress()).age(customerDto.getAge())
                        .build());
    }
}
