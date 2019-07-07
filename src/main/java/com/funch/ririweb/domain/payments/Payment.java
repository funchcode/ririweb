package com.funch.ririweb.domain.payments;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "PAYMENTS_TB")
public final class Payment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentPk;
    private int card;
    private int cash;
    private String receiptStGb;
    private int primeCost;
    private int discountRate;
    private int paymentCost;
    private String memo;
    private int reservationFk;
    private int hisUsedFk;

    private Payment(Builder builder) {
        card = builder.card;
        cash = builder.cash;
        receiptStGb = builder.receiptStGb;
        primeCost = builder.primeCost;
        discountRate = builder.discountRate;
        paymentCost = builder.paymentCost;
        memo = builder.memo;
        reservationFk = builder.reservationFk;
        hisUsedFk = builder.hisUsedFk;
    }

    public static class Builder {
        private int card;
        private int cash;
        private String receiptStGb;
        private int primeCost;
        private int discountRate;
        private int paymentCost;
        private String memo;
        private int reservationFk;
        private int hisUsedFk;

        public Payment build() {
            return new Payment(this);
        }

        public Builder hisUsedFk(int val) {
            this.hisUsedFk = val;
            return this;
        }

        public Builder reservationFk(int val) {
            this.reservationFk = val;
            return this;
        }

        public Builder memo(String val) {
            this.memo = val;
            return this;
        }

        public Builder discountRate(int val) {
            this.discountRate = val;
            return this;
        }

        public Builder receiptStGb(String val) {
            this.receiptStGb = val;
            return this;
        }

        public Builder cash(int val) {
            this.cash = val;
            return this;
        }

        public Builder card(int val) {
            this.card = val;
            return this;
        }

        public Builder(int primeCost, int paymentCost) {
            this.primeCost = primeCost;
            this.paymentCost = paymentCost;
            /**
             * receiptStGb default
             */
            this.receiptStGb = Code.RECEIPT_N;
            this.discountRate = 0;
        }
    }
}
