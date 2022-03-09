package com.societybank.society.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EmployeeResponseModel {
    int dataCount = 0;
    List<EmployeeDto> employees = new ArrayList<>();
}
