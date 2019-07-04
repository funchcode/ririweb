package com.funch.ririweb.domain.guests;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
    Guest findTopByOrderByGuestPkDesc();
}
