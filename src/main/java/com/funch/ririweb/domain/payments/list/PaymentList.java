package com.funch.ririweb.domain.payments.list;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "HISTORY_PAYMENT_LIST_TB")
public final class PaymentList extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hisListPk;
    private int primeCost;
    private int amount;
    private int paymentCost;
    private String paymentStGb;
    private int reservationFk;
    private int servicesChFk;
    private int goodFk;
    private int staffFk;

    private PaymentList(Builder builder) {
        primeCost = builder.primeCost;
        amount = builder.amount;
        paymentCost = builder.paymentCost;
        paymentStGb = builder.paymentStGb;
        reservationFk = builder.reservationFk;
        servicesChFk = builder.servicesChFk;
        goodFk = builder.goodFk;
        staffFk = builder.staffFk;
    }

    public static class Builder {
        private final int primeCost;
        private int amount;
        private final int paymentCost;
        private String paymentStGb;
        private final int reservationFk;
        private int servicesChFk;
        private int goodFk;
        private final int staffFk;

        public PaymentList build() {
            if(servicesChFk == 0 && goodFk == 0)
                throw new NullPointerException();
            return new PaymentList(this);
        }

        public Builder goodFk(int val) {
            this.goodFk = val;
            return this;
        }

        public Builder servicesChFk(int val) {
            this.servicesChFk = val;
            return this;
        }

        public Builder amount(int val) {
            this.amount = val;
            return this;
        }

        public Builder(int primeCost, int paymentCost, int reservationFk, int staffFk) {
            this.primeCost = primeCost;
            this.paymentCost = paymentCost;
            this.reservationFk = reservationFk;
            this.staffFk = staffFk;
            this.amount = 1;
            this.paymentStGb = Code.STATUS_STANDBY;
        }
    }
}
