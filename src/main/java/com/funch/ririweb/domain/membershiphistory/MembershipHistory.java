package com.funch.ririweb.domain.membershiphistory;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class MembershipHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long membershipHistoryNo;

    private int usedPayment;

    private long membershipRegistrationNo;

}
