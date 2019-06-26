package com.funch.ririweb.domain.membershipregistration;

import com.funch.ririweb.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MembershipRegistration extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long membershipRegistration;

    private int balance;

    private long membershipNo;

    private long paymentNo;

    private long guestNo;

}
