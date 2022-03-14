package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable {
    private final Long id;
    private final String empName;
    private final Long mobileNumber;
    private final Boolean isAdmin;
    private final String password;
    private final Boolean viewAccess;
}
