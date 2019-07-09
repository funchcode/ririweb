package com.funch.ririweb.service;

import com.funch.ririweb.domain.guests.Guest;
import com.funch.ririweb.domain.guests.GuestRepository;
import com.funch.ririweb.domain.staffs.Staff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;


    @Transactional
    public void enroll(Guest guest) {
        guestRepository.save(guest);
    }

    @Transactional
    public List<Guest> getAll() {

        return guestRepository.findAllByOrderByGuestPkDesc();
    }

    @Transactional
    public Guest getOneByGuestPk(int guestPk) {

        return guestRepository.findByGuestPk(guestPk);
    }

    @Transactional
    public void update(Guest guest) {
        guestRepository.save(guest);
    }

}
