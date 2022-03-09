package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InvoiceDto implements Serializable {
    private Integer subscriberId;
    private String subscritionStartDate;
    private Integer plan;
    private String paymentId;
}
