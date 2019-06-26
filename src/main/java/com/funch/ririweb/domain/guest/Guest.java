package com.funch.ririweb.domain.guest;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long guestNo;

    private String name;

    private String phone;

    private char gender;

    private String birthday;

    private String address;

    private char marriage;

    private String memo;

    private int recommenderNo;

    private String job;

    private int staffNo;

    private int commonCodeNo;

}
