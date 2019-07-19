package com.funch.ririweb.membership;

import com.funch.ririweb.domain.memberships.Membership;
import com.funch.ririweb.domain.memberships.MembershipRepository;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryRepository;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistory;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistoryRepository;
import com.funch.ririweb.service.MembershipUsedService;
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
public class MbsPurchaseHisServiceTests {

    @Autowired
    private MembershipPurchasedHistoryRepository mbsPurchasedRepository;
    @Autowired
    private MembershipUsedHistoryRepository mbsUsedRepository;
    @Autowired
    private MembershipUsedService mbsUsedService;

    private MembershipPurchasedHistory inputMbsPurchasedH;
    private MembershipPurchasedHistory getMbsPurchasedH;
    private MembershipUsedHistory getMbsUsedH;
    private Membership mbs;

    private LocalDate nowDate;

    @Before
    public void setUp() {
        nowDate = LocalDate.now();
    }

    @Test
    public void purchaseMembership() {
        // TODO set mbsPurchase Parameter
        LocalDate expiration = nowDate;
        int mbsFk = 1;
        int guestFk = 3;

        inputMbsPurchasedH = new MembershipPurchasedHistory(expiration, mbsFk, guestFk);
        getMbsPurchasedH = mbsPurchasedRepository.save(inputMbsPurchasedH);

        getMbsUsedH = mbsUsedService.enrollFirst(getMbsPurchasedH);

        Assert.assertNotEquals(getMbsPurchasedH, null);
        Assert.assertNotEquals(getMbsUsedH, null);

        mbsUsedRepository.delete(getMbsUsedH);
        mbsPurchasedRepository.delete(getMbsPurchasedH);
    }


}
