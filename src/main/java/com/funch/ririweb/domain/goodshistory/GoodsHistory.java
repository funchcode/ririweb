package com.funch.ririweb.domain.goodshistory;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "GOODSHISTORY")
@NoArgsConstructor
@Getter
public final class GoodsHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goodshistoryno")
    private long goodsHistoryNo;

    @Column(name = "primecost")
    private int primeCost;

    private int amount;

    @Column(name = "discountrate")
    private int discountRate;

    private int discount;

    private int payment;

    private char cancel;

    @Column(name = "staffno")
    private long staffNo;

    @Column(name = "paymentno")
    private long paymentNo;

    @Column(name = "goodsno")
    private long goodsNo;

    public GoodsHistory(long staffNo, long paymentNo, long goodsNo, int primeCost, int amount, int payment) {
        this.staffNo = staffNo;
        this.paymentNo = paymentNo;
        this.goodsNo = goodsNo;
        this.primeCost = primeCost;
        this.amount = amount;
        this.payment = payment;
        this.cancel = 'n';
    }

    public GoodsHistory setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public GoodsHistory setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public GoodsHistory setCancel(char cancel) {
        this.cancel = cancel;
        return this;
    }

}
