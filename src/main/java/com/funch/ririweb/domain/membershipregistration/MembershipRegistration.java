package com.funch.ririweb.domain.membershipregistration;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "MEMBERSHIP_REGISTRATION")
public final class MembershipRegistration extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membershipregistrationno")
    private long membershipRegistrationNo;

    private int balance;

    @Column(name = "membershipno")
    private long membershipNo;

    @Column(name = "paymentno")
    private long paymentNo;

    @Column(name = "guestno")
    private long guestNo;

    public MembershipRegistration(long membershipNo, long paymentNo, long guestNo, int balance) {
        this.membershipNo = membershipNo;
        this.paymentNo = paymentNo;
        this.guestNo = guestNo;
        this.balance = balance;
    }

}
