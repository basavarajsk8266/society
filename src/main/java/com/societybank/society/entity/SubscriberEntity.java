package com.societybank.society.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "subscriber")
public class SubscriberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriber_id", nullable = false)
    private Integer id;

    @Column(name = "mobile_number", nullable = true)
    private Integer mobileNumber;

    @Column(name = "first_name", nullable = true, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = true, length = 20)
    private String lastName;

    @Column(name = "DOB", nullable = true)
    private LocalDate dob;

    @Column(name = "occupation", nullable = true, length = 20)
    private String occupation;

    @Column(name = "society", nullable = true, length = 20)
    private String society;

    @Column(name = "ReferenceEmp_id", nullable = true)
    private Integer referenceempId;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "activeDaysLeft")
    private Integer activeDaysLeft;

    @Column(name = "selfSubscription", nullable = true)
    private Boolean selfSubscription = false;

    @Column(name = "filliedBy", nullable = true)
    private Integer filliedBy;


}