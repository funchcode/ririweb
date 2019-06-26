package com.funch.ririweb.domain.cservice;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CService extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cserviceNo;

    private String cname;

    private int price;

    private char used;

    private String memo;

    private long pserviceNo;

}
