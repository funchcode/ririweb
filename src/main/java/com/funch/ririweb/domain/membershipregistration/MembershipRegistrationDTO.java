package com.funch.ririweb.domain.membershipregistration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class MembershipRegistrationDTO {

    private int balance;
    private long membershipNo;
    private long paymentNo;
    private long guestNo;

    public MembershipRegistration toEntity() {
        return new MembershipRegistration(membershipNo, paymentNo, guestNo, balance);
    }

}
