package com.funch.ririweb.domain;

import com.funch.ririweb.domain.staff.Staff;
import com.funch.ririweb.domain.staff.StaffRepository;
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
public final class StaffRepositoryTests {
    @Autowired
    private StaffRepository staffRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 직원_등록() {
        // TODO given ( part : 임시데이터[0] )
        Staff staff = new Staff.Builder("T E S T 0", "010-0000-0000", 0, LocalDate.now())
                .build();

        // TODO when
        staffRepository.save(staff);
        Staff recent = staffRepository.findTopByName(staff.getName());

        // TODO then
        Assert.assertEquals(staff.getName(), recent.getName());
    }

    @After
    public void 후처리() {

    }
}
