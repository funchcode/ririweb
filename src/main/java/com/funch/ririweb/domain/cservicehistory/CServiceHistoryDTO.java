package com.funch.ririweb.domain.cservicehistory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CServiceHistoryDTO {

    private int primeCost;
    private int discountRate;
    private int discount;
    private int payment;
    private char cancel;
    private long staffNo;
    private long cserviceNo;

    public CServiceHistory toEntity() {
        return new CServiceHistory(staffNo, cserviceNo, primeCost, payment).setCancel(cancel)
                .setDiscount(discount).setDiscountRate(discountRate);
    }

}
