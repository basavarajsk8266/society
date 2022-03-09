package com.societybank.society.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subscriber")
public class SubscriberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriber_id", nullable = false)
    private Integer id;

    @Column(name = "mobile_number", nullable = false)
    private Integer mobileNumber;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "DOB", nullable = false)
    private LocalDate dob;

    @Column(name = "occupation", nullable = false, length = 20)
    private String occupation;

    @Column(name = "society", nullable = false, length = 20)
    private String society;

    @Column(name = "ReferenceEmp_id", nullable = false)
    private Integer referenceempId;

    @Column(name = "address", nullable = false)
    private Boolean address = false;

    @Column(name = "activeDaysLeft")
    private Integer activeDaysLeft;

    @Column(name = "selfSubscription", nullable = false)
    private Boolean selfSubscription = false;

    @Column(name = "filliedBy", nullable = false)
    private Integer filliedBy;

    public Integer getFilliedBy() {
        return filliedBy;
    }

    public void setFilliedBy(Integer filliedBy) {
        this.filliedBy = filliedBy;
    }

    public Boolean getSelfSubscription() {
        return selfSubscription;
    }

    public void setSelfSubscription(Boolean selfSubscription) {
        this.selfSubscription = selfSubscription;
    }

    public Integer getActiveDaysLeft() {
        return activeDaysLeft;
    }

    public void setActiveDaysLeft(Integer activeDaysLeft) {
        this.activeDaysLeft = activeDaysLeft;
    }

    public Boolean getAddress() {
        return address;
    }

    public void setAddress(Boolean address) {
        this.address = address;
    }

    public Integer getReferenceempId() {
        return referenceempId;
    }

    public void setReferenceempId(Integer referenceempId) {
        this.referenceempId = referenceempId;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}