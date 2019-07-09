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

import java.util.List;

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

    @Test
    public void 고객_모두_가져오기() {
        List<Guest> list
                = guestRepository.findAllByOrderByGuestPkDesc();

        Assert.assertNotEquals(list, null);
    }

    @Test
    public void 특정_고객_가져오기() {
        int guestPk = 3;

        Guest guest =
                guestRepository.findByGuestPk(guestPk);

        Assert.assertNotEquals(guest, null);
    }

    @After
    public void 후처리() {

    }
}
