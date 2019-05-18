package com.funch.ririweb.service;

import com.funch.ririweb.domain.reservation.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
    기존 회원으로 등록 | 등록되지 않은 고객으로 등록
    예약 시간과 시술 선택은 필수로 받아서 예약 등록,
    등록되어 있는 예약 정보 변경(회원명, 직원, 시술, 예약 시간),
    예약 취소
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReservationServiceTests {
    @Autowired
    ReservationRepository reservationRepository;

    @Test
    public void 예약_등록() {   // 직원, 고객, 시술 선택, 예약 시간 선택

    }
}
