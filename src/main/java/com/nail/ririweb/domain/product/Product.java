package com.nail.ririweb.domain.product;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Product {
    @Id
    private Integer productNo;

    private String name;

    private long inPrice;

    private long salePrice;

    private String state;

    private int stock;

    private String memo;

    private Object createdAt;

    private Object updatedAt;
}
