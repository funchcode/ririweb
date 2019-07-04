package com.funch.ririweb.domain;


import com.funch.ririweb.domain.membershiphistory.MembershipHistory;
import com.funch.ririweb.domain.membershiphistory.MembershipHistoryRepository;
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
public class MembershipHistoryRepositoryTests {

    @Autowired
    private MembershipHistoryRepository membershipHistoryRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 히스토리_등록() {
        // TODO given
        MembershipHistory membershipHistory = new MembershipHistory(1, 1000);

        // TODO when
        membershipHistoryRepository.save(membershipHistory);
        MembershipHistory recent = membershipHistoryRepository.findTopByOrderByMembershipHistoryNoDesc();

        // TODO then ( 멤버십 번호로 비교 )
        Assert.assertEquals(membershipHistory.getMembershipRegistrationNo(), recent.getMembershipRegistrationNo());
    }

    @After
    public void 후처리() {

    }

}
