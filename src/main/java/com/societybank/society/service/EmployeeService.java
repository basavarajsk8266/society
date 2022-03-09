package com.societybank.society.service;

import com.societybank.society.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    EmployeeDto save(EmployeeDto employees);

    List<EmployeeDto> findAll();

//    Optional<EmployeeDto> findById(Long id);

}
