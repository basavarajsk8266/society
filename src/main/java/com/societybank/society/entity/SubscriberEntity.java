package com.societybank.society.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@Table(name = "subscriber")
public class SubscriberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriber_id", nullable = false)
    private Long id;

    @Column(name = "mobile_number", nullable = false)
    private Long mobileNumber;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "DOB", nullable = false)
    private LocalDate dob;

    @Column(name = "occupation", nullable = false, length = 20)
    private String occupation;

    @Column(name = "society", nullable = false, length = 50)
    private String society;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ReferenceEmp_id", nullable = false)
    private EmployeeEntity referenceEmp;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "activeDaysLeft")
    private Long activeDaysLeft;

    @Column(name = "selfSubscription", nullable = false)
    private Boolean selfSubscription = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "filliedBy", nullable = false)
    private EmployeeEntity filliedBy;


}