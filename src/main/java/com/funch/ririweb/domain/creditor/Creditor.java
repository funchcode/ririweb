package com.funch.ririweb.domain.creditor;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Creditor extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long creditorNo;

    private String name;

    private String supplier;

    private String phone;

    private char used;

    private String memo;

}
