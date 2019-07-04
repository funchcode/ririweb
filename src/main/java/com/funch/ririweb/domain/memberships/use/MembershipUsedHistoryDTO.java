package com.funch.ririweb.domain.memberships.use;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class MembershipUsedHistoryDTO {

    private int usedPrice;
    private int balance;
    private int hisPurchaseFk;

    public MembershipUsedHistory toEntity() {
        return new MembershipUsedHistory(hisPurchaseFk, usedPrice, balance);
    }

}
