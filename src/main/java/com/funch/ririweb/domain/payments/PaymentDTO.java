package com.funch.ririweb.domain.payments;

import com.funch.ririweb.domain.commons.ReceiptType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public final class PaymentDTO {

    private int card;
    private int cash;
    private String receiptStGb;
    private int primeCost;
    private int discountRate;
    private int paymentCost;
    private String memo;
    private int reservationFk;
    private int hisUsedFk;

    public Payment toEntity() {
        return new Payment.Builder(primeCost, paymentCost).memo(memo).card(card).cash(cash)
                .discountRate(discountRate).hisUsedFk(hisUsedFk).receiptStGb(receiptStGb).reservationFk(reservationFk).build();
    }
}
