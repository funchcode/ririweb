package com.funch.ririweb.domain.reservationList;

import com.funch.ririweb.domain.ReservationList.ReservationList;
import com.funch.ririweb.domain.ReservationList.ReservationListRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReservationListRepositoryTests {
    @Autowired
    ReservationListRepository reservationListRepository;

    @Test
    public void 예약_리스트_등록() {
        // given
        ReservationList reservationList = ReservationList.builder()
                .reservationNo(12).build();

        // when
        reservationListRepository.save(reservationList);

        // then
        Assert.assertEquals(reservationListRepository.findAll().size(), 3);
    }
}
