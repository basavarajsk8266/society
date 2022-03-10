package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SubscriberDto implements Serializable {

    private Integer id;
    private Integer mobileNumber;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String occupation;
    private String society;
    private Integer referenceempId;
    private Boolean address;
    private Integer activeDaysLeft;
    private Boolean selfSubscription;
    private Integer filliedBy;
}
