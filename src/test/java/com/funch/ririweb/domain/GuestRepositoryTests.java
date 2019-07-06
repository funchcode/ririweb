package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
import com.funch.ririweb.domain.guests.Guest;
import com.funch.ririweb.domain.guests.GuestRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuestRepositoryTests {
    @Autowired
    private GuestRepository guestRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 고객_등록() {
        // TODO given
        Guest guest = new Guest.Builder("김말큐", "010-0000-0000").build();

        // TODO when
        guestRepository.save(guest);
        Guest recentData = guestRepository.findTopByOrderByGuestPkDesc();

        // TODO then
        Assert.assertEquals(guest.getGuestNm(), recentData.getGuestNm());
    }

    @After
    public void 후처리() {

    }
}