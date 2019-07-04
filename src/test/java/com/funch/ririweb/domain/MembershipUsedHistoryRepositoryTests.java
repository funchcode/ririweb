package com.funch.ririweb.domain;

import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorRepository;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistory;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistoryRepository;
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
public class MembershipUsedHistoryRepositoryTests {

    @Autowired
    private MembershipUsedHistoryRepository membershipUsedHistoryRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 매입처_등록() {
        // TODO given
        MembershipUsedHistory membershipUsedHistory =
                new MembershipUsedHistory(2, 1000, 2000);

        // TODO when
        membershipUsedHistoryRepository.save(membershipUsedHistory);
        MembershipUsedHistory recentData =
                membershipUsedHistoryRepository.findTopByOrderByHisUsedPkDesc();

        // TODO then
        Assert.assertEquals(membershipUsedHistory.getHisUsedPk(),
                recentData.getHisUsedPk());
    }

    @After
    public void 후처리() {

    }

}
