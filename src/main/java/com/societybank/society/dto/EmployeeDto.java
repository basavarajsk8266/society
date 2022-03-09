package com.societybank.society.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable {

    private String empName;

    private Integer mobileNumber;

    private Integer isAdmin;

    private String password;

    private Integer viewAccess;

    private Integer addAccess;

    private Integer updateAccess;

    private Integer superAdmin;

}
