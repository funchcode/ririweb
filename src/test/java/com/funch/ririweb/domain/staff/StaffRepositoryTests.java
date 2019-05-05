package com.funch.ririweb.domain.staff;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StaffRepositoryTests {
    @Autowired
    StaffRepository staffRepository;

    @Test
    public void 직원_등록_테스트() {
        // given
        Staff staff = Staff.builder().name("마스터").build();
        List<Staff> result;

        // when
        staffRepository.save(staff);
        result = staffRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getName(), staff.getName());
    }
}
