package com.funch.ririweb.domain.reservation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class ReservationDTO {

    private LocalDateTime visitTime;
    private LocalDateTime finishTime;
    private long cserviceHistoryNo;
    private long staffNo;
    private long guestNo;
    private long commonCodeNo;

    public Reservation toEntity() {
        return new Reservation(staffNo, commonCodeNo, visitTime, finishTime)
                .setGuestNo(guestNo).setCServiceHistoryNo(cserviceHistoryNo);    }

}
