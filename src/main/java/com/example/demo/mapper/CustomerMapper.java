package com.example.demo.mapper;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "customerId", source = "id")
    CustomerDto customerToDto(CustomerEntity customerEntity);

    @Mapping(target = "id", source = "customerId")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    CustomerEntity customerToEntity(CustomerDto customerEntity);
}
