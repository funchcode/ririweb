package com.funch.ririweb.service;

import com.funch.ririweb.domain.membership.Membership;
import com.funch.ririweb.domain.membershipList.MembershipList;
import com.funch.ririweb.domain.membershipList.MembershipListRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MembershipListServiceTests {
    @Autowired
    MembershipListRepository membershipListRepository;

    @Test
    public void 회원권_등록_테스트() {
        // given
        long clientNo = 3;
        MembershipList membershipList = MembershipList.builder()
                .clientNo(clientNo).membershipNo(17).restPrice(150000).build();
        List<MembershipList> results;

        // when
        membershipListRepository.save(membershipList);
        results = membershipListRepository.findAll();

        // then
        Assert.assertEquals(results.get(0).getClientNo(), clientNo);
    }
}
