package com.funch.ririweb.domain;

import com.funch.ririweb.domain.membershipregistration.MembershipRegistration;
import com.funch.ririweb.domain.membershipregistration.MembershipRegistrationRepository;
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
public class MembershipRegistrationRepositoryTests {

    @Autowired
    private MembershipRegistrationRepository membershipRegistrationRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO given
        MembershipRegistration membershipRegistration =
                new MembershipRegistration(1, 1, 1, 100000);

        // TODO when
        membershipRegistrationRepository.save(membershipRegistration);
        MembershipRegistration recent = membershipRegistrationRepository.findTopByOrderByMembershipRegistrationNoDesc();

        // TODO then
        Assert.assertEquals(membershipRegistration.getGuestNo(), recent.getGuestNo());
    }

    @After
    public void 후처리() {

    }

}
