package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
import com.funch.ririweb.domain.reservations.Reservation;
import com.funch.ririweb.domain.reservations.ReservationRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReservationRepositoryTests {

    @Autowired
    private ReservationRepository reservationRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 예약_등록() {
        // TODO given
        Reservation res = new Reservation.Builder(LocalDateTime.now())
                .finishedTime(LocalDateTime.now()).build();

        // TODO when
        reservationRepository.save(res);
        Reservation recentData = reservationRepository.findTopByOrderByReservationPkDesc();

        // TODO then
        Assert.assertEquals(res.getReservationStGb(), recentData.getReservationStGb());
    }

    @After
    public void 후처리() {

    }

}
