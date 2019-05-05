package com.funch.ririweb.service;

import com.funch.ririweb.domain.staff.Staff;
import com.funch.ririweb.domain.staff.StaffRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StaffServiceTests {
    @Autowired
    StaffRepository staffRepository;

    @Test
    public void 직원_등록() {   // 직원 등록 화면
        // given
        Staff staff = Staff.builder().name("미미").phone("010-4444-4444").build();
        List<Staff> results;

        // when
        staffRepository.save(staff);
        results = staffRepository.findAll();

        // then
        Assert.assertEquals(results.size(), 2);
    }

    @Test
    public void 직원_불러오기() {     // 결제, 회원 등록 시에 직원 불러오기
        // given
        List<Staff> staffs;

        // when
        staffs = staffRepository.findAll();

        // then
        Assert.assertEquals(staffs.size(), 2);
    }
}
