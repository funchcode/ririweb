package com.funch.ririweb.domain;


import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryRepository;
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
public class MembershipPurchaseHistoryRepositoryTests {

    @Autowired
    private MembershipPurchasedHistoryRepository membershipPurchaseRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 회원권_구매() {
        // TODO given
        MembershipPurchasedHistory membershipPurchase =
                new MembershipPurchasedHistory(LocalDate.now(), 1, 3);

        // TODO when
        membershipPurchaseRepository.save(membershipPurchase);
        MembershipPurchasedHistory recentData = membershipPurchaseRepository.findTopByOrderByMembershipFkDesc();

        // TODO then ( 만료 날로 비교 )
        Assert.assertEquals(membershipPurchase.getExpiration(), recentData.getExpiration());
    }

    @After
    public void 후처리() {

    }
}
