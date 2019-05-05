package com.funch.ririweb.service;

import com.funch.ririweb.domain.reservation.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReservationServiceTests {
    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void 예약_등록() {   // 직원, 고객, 시술 선택, 예약 시간 선택

    }
}
