package com.funch.ririweb.domain.reservations;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    Reservation findTopByOrderByReservationPkDesc();
}
