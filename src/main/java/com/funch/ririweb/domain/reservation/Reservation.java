package com.funch.ririweb.domain.reservation;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "RESERVATION")
@Getter
public final class Reservation extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationno")
    private long reservationNo;

    @Column(name = "visittime")
    private LocalDateTime visitTime;

    @Column(name = "finishtime")
    private LocalDateTime finishTime;

    @Column(name = "cservicehistoryno")
    private long cserviceHistoryNo;

    @Column(name = "staffno")
    private long staffNo;

    @Column(name = "guestno")
    private long guestNo;

    @Column(name = "commoncodeno")
    private long commonCodeNo;

    public Reservation(long staffNo, long commonCodeNo, LocalDateTime visitTime, LocalDateTime finishTime) {
        this.staffNo      = staffNo;
        this.commonCodeNo = commonCodeNo;
        this.visitTime    = visitTime;
        this.finishTime   = finishTime;
    }

    public Reservation setGuestNo(long guestNo) {
        this.guestNo = guestNo;
        return this;
    }

    public Reservation setCServiceHistoryNo(long cserviceHistoryNo) {
        this.cserviceHistoryNo = cserviceHistoryNo;
        return this;
    }

}
