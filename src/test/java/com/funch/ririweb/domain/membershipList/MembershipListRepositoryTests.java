package com.funch.ririweb.domain.membershipList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MembershipListRepositoryTests {
    @Autowired
    MembershipListRepository membershipListRepository;

    @Test
    public void 손님_회원권_등록() {
        // given
        MembershipList membershipList = MembershipList.builder()
                .membershipNo(5).restPrice(100000).build();
        List<MembershipList> result;

        // when
        membershipListRepository.save(membershipList);
        result = membershipListRepository.findAll();

        // then
        Assert.assertSame(result.get(0).getRestPrice(), membershipList.getRestPrice());
    }
}
