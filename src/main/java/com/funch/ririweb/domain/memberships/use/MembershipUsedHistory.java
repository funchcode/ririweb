package com.funch.ririweb.domain.memberships.use;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "HISTORY_MEMBERSHIP_USED_TB")
public final class MembershipUsedHistory extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hisUsedPk;
    private int usedPrice;
    private int balance;
    private int hisPurchaseFk;

    public MembershipUsedHistory(int hisPurchaseFk, int usedPrice, int balance) {
        this.usedPrice = usedPrice;
        this.balance = balance;
        this.hisPurchaseFk = hisPurchaseFk;
    }
}
