package com.funch.ririweb.domain.cservicehistory;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CServiceHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cserviceHistoryNo;

    private int primeCost;

    private int discountRate;

    private int discount;

    private int payment;

    private char cancel;

    private long staffNo;

    private long cserviceNo;

}
