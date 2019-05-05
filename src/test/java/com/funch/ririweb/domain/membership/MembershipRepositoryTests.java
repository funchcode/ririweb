package com.funch.ririweb.domain.membership;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MembershipRepositoryTests {
    @Autowired
    MembershipRepository membershipRepository;

    @Test
    public void 회원권_등록_테스트() {
        // given
        Membership membership = Membership.builder().method("20만원")
                .chargePrice(100000).build();
        List<Membership> result;

        // when
        membershipRepository.save(membership);
        result = membershipRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getMethod(), membership.getMethod());
    }
}
