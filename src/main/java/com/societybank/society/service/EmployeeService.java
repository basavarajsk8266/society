package com.societybank.society.service;

import com.societybank.society.dto.EmployeeDto;
import com.societybank.society.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmployeeDto save(EmployeeDto employees);

    List<EmployeeDto> findAll();

    Optional<EmployeeEntity> findById(Integer id);

    EmployeeDto update(EmployeeDto employees);

    void deleteEmployee(Integer id);
}
