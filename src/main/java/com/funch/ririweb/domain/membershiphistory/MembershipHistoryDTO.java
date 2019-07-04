package com.funch.ririweb.domain.membershiphistory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class MembershipHistoryDTO {

    private long membershipHistoryNo;
    private int usedPayment;

    public MembershipHistory toEntity() {
        return new MembershipHistory(membershipHistoryNo, usedPayment);
    }

}
