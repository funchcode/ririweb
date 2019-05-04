package com.nail.ririweb.domain.reservation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Reservation {
    @Id
    private Integer reservationNo;

    private Integer clientNo;

    private Integer staffNo;

    private Integer serviceNo;

    private Object time;

    private String state;

    private String memo;

    private Object createdAt;

    private Object updatedAt;
}
