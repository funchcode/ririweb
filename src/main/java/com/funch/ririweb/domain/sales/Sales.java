package com.funch.ririweb.domain.sales;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class Sales extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long salesNo;

    @NotNull
    @Column(nullable = false)
    private long staffNo;

    @NotNull
    @Column(nullable = false)
    private long reservationNo;

    @NotNull
    @Column(nullable = false)
    private long commonCodeNo;

    @NotNull
    @Column(nullable = false)
    private long serviceNo;

    private String payment;

    private LocalDateTime salesDate;

    private double totalPrice;

    private double discountPrice;

    private double finalPrice;

    @NotNull
    @Column(nullable = false)
    private char completed;
}
