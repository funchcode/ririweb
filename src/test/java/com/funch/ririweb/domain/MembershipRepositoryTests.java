package com.funch.ririweb.domain;

import com.funch.ririweb.domain.guests.Guest;
import com.funch.ririweb.domain.guests.GuestRepository;
import com.funch.ririweb.domain.memberships.Membership;
import com.funch.ririweb.domain.memberships.MembershipRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MembershipRepositoryTests {
    @Autowired
    private MembershipRepository membershipRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 회원권_등록() {
        // TODO given
        Membership membership = new Membership("10만원 권", 100000, 120000);

        // TODO when
        membershipRepository.save(membership);
        Membership recentData = membershipRepository.findTopByOrderByMembershipPkDesc();

        // TODO then
        Assert.assertEquals(membership.getMembershipNm(), recentData.getMembershipNm());
    }

    @After
    public void 후처리() {

    }
}
