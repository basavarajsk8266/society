package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

@Data
public class PaymentDto implements Serializable {
    private Long id;
    private Integer amount;
    private SubscriberEntityDto subscriber;
    private Instant createdDate;
    private String orderId;
    private String razorpayOrderId;
    private String razorpayPaymentId;
    private String receiptNo;
    private String status;

    @Data
    public static class SubscriberEntityDto implements Serializable {
        private Long id;
        private Long mobileNumber;
        private String firstName;
        private String lastName;
        private LocalDate dob;
        private String occupation;
        private String society;
        private String address;
        private Long activeDaysLeft;
        private Boolean selfSubscription;
    }
}
