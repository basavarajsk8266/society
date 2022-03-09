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
@Table(name = "invoice")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id", nullable = false)
    private Integer id;

    @Column(name = "subscriber_id")
    private Integer subscriberId;

    @Column(name = "subscritionStartDate", length = 20)
    private String subscritionStartDate;

    @Column(name = "plan", nullable = false)
    private Integer plan;

    @Column(name = "payment_id", length = 20)
    private String paymentId;

   }