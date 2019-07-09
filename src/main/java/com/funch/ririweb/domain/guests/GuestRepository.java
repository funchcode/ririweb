package com.funch.ririweb.domain.guests;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
    Guest findTopByOrderByGuestPkDesc();

    List<Guest> findAllByOrderByGuestPkDesc();

    Guest findByGuestPk(int guestPk);
}
