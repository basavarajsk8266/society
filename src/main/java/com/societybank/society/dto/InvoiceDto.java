package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InvoiceDto implements Serializable {
    private final Integer subscriberId;
    private final String subscritionStartDate;
    private final Integer plan;
    private final String paymentId;
}
