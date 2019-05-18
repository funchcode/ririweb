package com.funch.ririweb.domain.ReservationList;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ReservationList extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationListNo;

    @Column(name = "RESERVATION_NO",nullable = false)
    private long reservationNo;

    @Column(name = "SERVICE_NO",nullable = false)
    private long serviceNo;

    @Column(name = "CANCEL_YN",nullable = false)
    private char cancelYn;

    @Builder
    private ReservationList(long reservationNo, long serviceNo) {
        this.reservationNo = reservationNo;
        this.serviceNo = serviceNo;
        this.cancelYn = 'N';
    }
}
