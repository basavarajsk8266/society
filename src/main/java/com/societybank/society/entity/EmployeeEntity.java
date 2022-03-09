package com.societybank.society.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@Table(name = "emp")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id", nullable = false)
    private Integer id;

    @Column(name = "emp_name", nullable = true, length = 20)
    private String empName;

    @Column(name = "mobile_number", nullable = true)
    private Integer mobileNumber;

    @Column(name = "is_admin", nullable = true)
    private Integer isAdmin;

    @Column(name = "password", nullable = true, length = 20)
    private String password;

    @Column(name = "view_access", nullable = true)
    private Integer viewAccess;

    @Column(name = "add_access", nullable = true)
    private Integer addAccess;

    @Column(name = "update_access", nullable = true)
    private Integer updateAccess;

    @Column(name = "super_admin", nullable = true)
    private Integer superAdmin;

}