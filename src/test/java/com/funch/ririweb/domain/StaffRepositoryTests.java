package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsRepository;
import com.funch.ririweb.domain.staffs.Staff;
import com.funch.ririweb.domain.staffs.StaffRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffRepositoryTests {


    @Autowired
    private StaffRepository staffRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 직원_등록() {
        // TODO given
        Staff staff = new Staff.Builder("김직원", "010-0000-0000", LocalDate.now()).build();

        // TODO when
        staffRepository.save(staff);
        Staff recentData = staffRepository.findTopByOrderByStaffPkDesc();

        // TODO then
        Assert.assertEquals(staff.getHiredDay(), recentData.getHiredDay());
    }

    @After
    public void 후처리() {

    }


}
