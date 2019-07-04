package com.funch.ririweb.domain;


import com.funch.ririweb.domain.membership.Membership;
import com.funch.ririweb.domain.membership.MembershipRepository;
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
        Membership membership = new Membership("TEST", 1000
        ,2000);

        // TODO when
        membershipRepository.save(membership);
        Membership recent = membershipRepository.findTopByOrderByMembershipNoDesc();

        // TODO then
        Assert.assertEquals(membership.getName(), recent.getName());
    }

    @After
    public void 후처리() {

    }
}
