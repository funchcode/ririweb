package com.nail.ririweb.domain.membership;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Membership {
    @Id
    private Integer membershipNo;

    private String method;

    private long chargePrice;

    private Object createdAt;

    private Object updatedAt;
}
