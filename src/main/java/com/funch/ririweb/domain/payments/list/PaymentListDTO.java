package com.funch.ririweb.domain.payments.list;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class PaymentListDTO {

    private int primeCost;
    private int amount;
    private int paymentCost;
    private String paymentStGb;
    private int reservationFk;
    private int servicesChFk;
    private int goodFk;
    private int staffFk;

    public PaymentList toEntity() {
        return new PaymentList.Builder(primeCost, paymentCost, reservationFk, staffFk)
                .amount(amount).goodFk(goodFk).servicesChFk(servicesChFk).build();
    }

}
