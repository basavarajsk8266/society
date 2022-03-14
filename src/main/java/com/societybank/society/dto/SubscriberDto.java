package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SubscriberDto implements Serializable {
    private final Long id;
    private final Long mobileNumber;
    private final String firstName;
    private final String lastName;
    private final LocalDate dob;
    private final String occupation;
    private final String society;
    private final EmployeeDto referenceEmp;
    private final String address;
    private final Long activeDaysLeft;
    private final Boolean selfSubscription;
    private final EmployeeDto filliedBy;

   


}
