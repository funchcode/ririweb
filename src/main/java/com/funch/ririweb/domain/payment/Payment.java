package com.funch.ririweb.domain.payment;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentNo;

    private long cserviceHistoryNo;

    private long goodsHistoryNo;

    private int card;

    private int cash;

    private char credit;

    private int primeCost;

    private int discountRate;

    private int payment;

    private String memo;

    private long reservationNo;

    private long guestNo;

}
