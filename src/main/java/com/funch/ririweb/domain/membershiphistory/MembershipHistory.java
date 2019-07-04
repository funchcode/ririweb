package com.funch.ririweb.domain.membershiphistory;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "MEMBERSHIP_HISTORY")
public final class MembershipHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membershiphistoryno")
    private long membershipHistoryNo;

    @Column(name = "usedpayment")
    private int usedPayment;

    @Column(name = "membershipregistrationno")
    private long membershipRegistrationNo;

    public MembershipHistory(long membershipHistoryNo, int usedPayment) {
        this.membershipRegistrationNo = membershipHistoryNo;
        this.usedPayment= usedPayment;
    }
}
