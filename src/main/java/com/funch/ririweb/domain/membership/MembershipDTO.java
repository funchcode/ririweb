package com.funch.ririweb.domain.membership;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public final class MembershipDTO {

    private String name;
    private int sellingPrice;
    private int charge;
    private LocalDate expiration;

    public Membership toEntity() {
        return new Membership(name, sellingPrice, charge).setExpiration(expiration);
    }

}
