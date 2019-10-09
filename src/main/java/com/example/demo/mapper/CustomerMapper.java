package com.example.demo.mapper;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToDto(CustomerEntity customerEntity);
}
