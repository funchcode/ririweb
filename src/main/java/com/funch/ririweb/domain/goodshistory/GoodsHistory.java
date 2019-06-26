package com.funch.ririweb.domain.goodshistory;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GoodsHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long goodsHistoryNo;

    private int primeCost;

    private int amount;

    private int discountRate;

    private int discount;

    private int payment;

    private char cancel;

    private long staffNo;

    private long paymentNo;

    private long goodsNo;

}
