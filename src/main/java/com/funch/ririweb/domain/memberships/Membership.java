package com.funch.ririweb.domain.memberships;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "MEMBERSHIPS_TB")
public final class Membership extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int membershipPk;
    private String membershipNm;
    private int sellingPrice;
    private int chargePrice;
    private String usedGb;

    public Membership(String membershipNm, int sellingPrice, int chargePrice) {
        this.membershipNm = membershipNm;
        this.sellingPrice = sellingPrice;
        this.chargePrice = chargePrice;
        /**
         * Used_GB default
         */
        this.usedGb = Code.USED_Y;
    }

    public Membership setUsedGb(String val) {
        this.usedGb = val;
        return this;
    }

}
