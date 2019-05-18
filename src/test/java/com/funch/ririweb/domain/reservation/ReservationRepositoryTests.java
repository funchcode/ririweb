package com.funch.ririweb.domain.reservation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReservationRepositoryTests {
    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void 예약_등록_테스트() {
        // given
        Reservation reservation = Reservation.builder().clientNo(3)
                .staffNo(10).build();
        List<Reservation> result;

        // when
        reservationRepository.save(reservation);
        result = reservationRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getClientNo(), reservation.getClientNo());
    }
}
