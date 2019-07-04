package com.funch.ririweb.domain;

import com.funch.ririweb.domain.reservation.Reservation;
import com.funch.ririweb.domain.reservation.ReservationRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public final class ReservationRepositoryTests {

    @Autowired
    private ReservationRepository reservationRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 예약_등록() {
        // TODO given
        Reservation reservation = new Reservation();

    }

    @After
    public void 후처리() {

    }

}
