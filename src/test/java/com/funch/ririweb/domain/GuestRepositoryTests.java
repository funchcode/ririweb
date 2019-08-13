package com.funch.ririweb.domain;

import com.funch.ririweb.domain.guests.Guest;
import com.funch.ririweb.domain.guests.GuestDTO;
import com.funch.ririweb.domain.guests.GuestRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
    
/**
 * TODO 고객 등록, 특정 고객 찾기, 모든 고객 찾기, 고객 정보 수정
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GuestRepositoryTests {

    @Autowired
    private GuestRepository guestRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 고객등록_프로세스() {
        String name = "김고객";
        String phone = "010-0000-0000";
        Guest guest = null;
        GuestDTO dto = new GuestDTO();
        dto.setGuestNm(name);
        dto.setPhone(phone);
        guest = dto.toEntity();

        if (dto.validation()) {
            Guest result = null;
            result = guestRepository.save(guest);
            // 결과물 처리
        }

        Guest recentData = null;
        recentData = guestRepository.findTopByOrderByGuestPkDesc();

        Assert.assertEquals(guest.getGuestPk(), recentData.getGuestPk());
    }

    /**
     * Key 변경 거부
     */
    @Test
    public void 고객정보수정_프로세스() {
        int existGuestPk = 4;

        GuestDTO guestDTO = new GuestDTO();
        String phone = "010-1111-1111";
        String memo = "신규 고객입니다.";
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
