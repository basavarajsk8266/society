package com.societybank.society.service;

import com.societybank.society.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto save(EmployeeDto employees);

    List<EmployeeDto> findAll();


}
