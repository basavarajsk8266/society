package com.societybank.society.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InvoiceDto implements Serializable {
    private final Long id;
    private final String subscritionStartDate;
    private final Long plan;
}
