package com.funch.ririweb.domain.memberships.purchase;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "HISTORY_MEMBERSHIP_PURCHASE_TB")
public final class MembershipPurchasedHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hisPurchasePk;
    private LocalDate expiration;
    private int membershipFk;
    private int guestFk;

    public MembershipPurchasedHistory(LocalDate expiration, int membershipFk, int guestFk) {
        this.expiration = expiration;
        this.membershipFk = membershipFk;
        this.guestFk = guestFk;
    }

}
