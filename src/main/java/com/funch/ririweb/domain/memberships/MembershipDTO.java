package com.funch.ririweb.domain.memberships;

import com.funch.ririweb.domain.commons.UseType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public final class MembershipDTO {

    private String membershipNm;
    private int sellingPrice;
    private int chargePrice;
    private UseType usedGb;

    public Membership toEntity() {
        return new Membership(membershipNm, sellingPrice, chargePrice).setUsedGb(usedGb);
    }

}
