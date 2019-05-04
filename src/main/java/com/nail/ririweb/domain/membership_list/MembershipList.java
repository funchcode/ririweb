package com.nail.ririweb.domain.membership_list;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class MembershipList {
    @Id
    private Integer membershipListNo;

    private Integer membershipNo;

    private long restPrice;

    private Object createdAt;

    private Object updatedAt;
}
