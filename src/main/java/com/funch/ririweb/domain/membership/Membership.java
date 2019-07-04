package com.funch.ririweb.domain.membership;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "MEMBERSHIP")
public final class Membership extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membershipno")
    private long membershipNo;

    private String name;

    @Column(name = "sellingprice")
    private int sellingPrice;

    private int charge;

    private LocalDate expiration;

    public Membership(String name, int sellingPrice, int charge) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.charge = charge;
    }

    public Membership setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        return this;
    }

}
