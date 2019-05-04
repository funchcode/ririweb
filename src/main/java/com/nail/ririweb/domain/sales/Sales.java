package com.nail.ririweb.domain.sales;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Sales {
    @Id
    private Integer salesNo;

    private Integer staffNo;

    private Integer reservationNo;

    private Integer commonCodeNo;

    private Integer serviceNo;

    private String payment;

    private Object salesDate;

    private long totalPrice;

    private long discountPrice;

    private long finalPrice;

    private Object createdAt;

    private Object updatedAt;
}
