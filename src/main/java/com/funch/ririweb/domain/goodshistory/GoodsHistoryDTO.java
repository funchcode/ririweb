package com.funch.ririweb.domain.goodshistory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GoodsHistoryDTO {

    private long staffNo;
    private long paymentNo;
    private long goodsNo;
    private int primeCost;
    private int amount;
    private int payment;
    private char cancel;
    private int discountRate;
    private int discount;

    public GoodsHistory toEntity() {
        return new GoodsHistory(staffNo, paymentNo, goodsNo, primeCost, amount, payment)
                .setDiscountRate(discountRate).setDiscount(discount).setCancel(cancel);
    }

}
