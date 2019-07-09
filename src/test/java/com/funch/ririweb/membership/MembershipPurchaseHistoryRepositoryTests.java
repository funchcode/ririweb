package com.funch.ririweb.membership;


import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryRepository;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MembershipPurchaseHistoryRepositoryTests {

    @Autowired
    private MembershipPurchasedHistoryRepository membershipPurchaseRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 회원권_구매시_사용이력_등록() {
        LocalDate expiration = LocalDate.now();
        int membershipFk = 1;
        int guestFk = 3;

        MembershipPurchasedHistory membershipPurchase =
                new MembershipPurchasedHistory(expiration, membershipFk, guestFk);

        MembershipPurchasedHistory enrollData =
                membershipPurchaseRepository.save(membershipPurchase);

        // 충전금액

        MembershipUsedHistory membershipUse =
                new MembershipUsedHistory();


        MembershipPurchasedHistory recentData = membershipPurchaseRepository.findTopByOrderByMembershipFkDesc();

        Assert.assertEquals(membershipPurchase.getExpiration(), recentData.getExpiration());
    }

    @Test
    public void 회원권_가져오기() {
        List<MembershipPurchasedHistory> list =
                membershipPurchaseRepository.findAllByOrderByHisPurchasePkDesc();

        Assert.assertNotEquals(list, null);
    }

    @Test
    public void 특정_회원권_가져오기() {
        int pk = 0;
        MembershipPurchasedHistory membershipPurchasedHistory =
                membershipPurchaseRepository.findByHisPurchasePk(pk);

        Assert.assertNotEquals(pk, null);
    }

    @After
    public void 후처리() {

    }
}
