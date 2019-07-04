package com.funch.ririweb.domain.memberships.purchase;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public final class MembershipPurchasedHistoryDTO {

    private LocalDate expiration;
    private int membershipFk;
    private int guestFk;

    public MembershipPurchasedHistory toEntity() {
        return new MembershipPurchasedHistory(expiration, membershipFk, guestFk);
    }

}
