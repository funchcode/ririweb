package com.funch.ririweb.domain.payment;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "PAYMENT")
public class Payment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentno")
    private long paymentNo;

    @Column(name = "cservicehistoryno")
    private long cserviceHistoryNo;

    @Column(name = "goodshistoryno")
    private long goodsHistoryNo;

    private int card;

    private int cash;

    private char credit;

    @Column(name = "primecost")
    private int primeCost;

    @Column(name = "discountrate")
    private int discountRate;

    private int payment;

    private String memo;

    @Column(name = "reservationno")
    private long reservationNo;

    @Column(name = "guestno")
    private long guestNo;

}
