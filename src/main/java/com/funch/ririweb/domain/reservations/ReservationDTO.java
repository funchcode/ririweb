package com.funch.ririweb.domain.reservations;


import java.time.LocalDateTime;

public final class ReservationDTO {

    private String reservationStGb;
    private LocalDateTime visitedTime;
    private LocalDateTime finishedTime;
    private int guestFk;
    private int staffFk;

    public Reservation toEntity() {
        return new Reservation.Builder(visitedTime).guestFk(guestFk).staffFk(staffFk)
                .finishedTime(finishedTime).reservationStGb(reservationStGb).build();
    }

}
