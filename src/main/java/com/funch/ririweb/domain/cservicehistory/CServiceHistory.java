package com.funch.ririweb.domain.cservicehistory;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "CSERVICE_HISTORY")
public final class CServiceHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cservicehistoryno")
    private long cserviceHistoryNo;

    @Column(name = "primecost")
    private int primeCost;

    @Column(name = "discountrate")
    private int discountRate;

    private int discount;

    private int payment;

    private char cancel;

    @Column(name = "staffno")
    private long staffNo;

    @Column(name = "cserviceno")
    private long cserviceNo;

    public CServiceHistory(long staffNo, long cserviceNo, int primeCost, int payment) {
        this.staffNo = staffNo;
        this.cserviceNo = cserviceNo;
        this.primeCost = primeCost;
        this.payment = payment;
        this.cancel = 'n';
    }

    public CServiceHistory setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public CServiceHistory setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public CServiceHistory setCancel(char cancel) {
        this.cancel = cancel;
        return this;
    }

}
