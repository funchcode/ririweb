package com.funch.ririweb.service;

import com.funch.ririweb.domain.membership.Membership;
import com.funch.ririweb.domain.membership.MembershipRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
    회원권 등록, 회원권 사용안함
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MembershipServiceTests {
    @Autowired
    MembershipRepository membershipRepository;

    @Test
    public void 회원권_등록() {
        // given
        Membership membership = Membership.builder().method("30만원").chargePrice(150000).build();
        List<Membership> results;

        // when
        membershipRepository.save(membership);
        results = membershipRepository.findAll();

        // then
        Assert.assertEquals(results.size(), 2);
    }
}
