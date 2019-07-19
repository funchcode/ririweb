package com.funch.ririweb.membership;

import com.funch.ririweb.domain.memberships.use.MembershipUsedHistory;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistoryRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbsUsedHisServiceTests {

    @Autowired
    private MembershipUsedHistoryRepository mbsUsedHisRepository;

    private List<MembershipUsedHistory> dummy;
    private List<MembershipUsedHistory> alldata;
    private MembershipUsedHistory inputUsedH;
    private MembershipUsedHistory getUsedH;

    @Before
    public void setUp() {
        dummy = new ArrayList<>();
    }

    @Test // 모든 회원권 가져오기
    public void getAll() {
        // TODO dummy data setting
        int size = 5;
        int hisPurchasedFk = 99999;
        int usedPrice = 99999;
        int Balance = 99999;

        // TODO  input 5 dummy data
        for( int i = 0 ; i < size ; i++ ) {
            inputDummyData(new MembershipUsedHistory(hisPurchasedFk, usedPrice, Balance));
        }
        // end dummy logic

        alldata = mbsUsedHisRepository.findAllByOrderByHisUsedPkDesc();

        Assert.assertNotEquals(alldata, null);
        Assert.assertEquals(true, alldata.size() >= size);

        // TODO reset Data
        deleteDummyData();
    }

    @Test // 특정 회원 회원권 가져오기 (Purchase)
    public void getListByGuestFk() {

    }

    @Test // 특정 회원 회원권 중 잔액이 남은 회원권 가져오기. (Purchase)
    public void getListNotZeroByGuestFk() {

    }

    @Test // 회원권을 사용한다.
    public void useMembership() {
        // TODO DUMMY Setting
        int purchaseFk = 99999;
        int usedPrice = 500;
        int balance = 1000;

        inputUsedH =
                new MembershipUsedHistory(purchaseFk, usedPrice, balance);

        getUsedH = mbsUsedHisRepository.save(inputUsedH);

        int overMoney = 5001;
        int lessMoney = 4999;

        // TODO DUMMY Delete
        mbsUsedHisRepository.delete(getUsedH);
    }

    /**
     * 더미데이터 삽입
     */
    private void inputDummyData(MembershipUsedHistory membershipUsedHistory) {
        dummy.add(
                mbsUsedHisRepository.save(membershipUsedHistory)
        );
    }

    /**
     * 입력한 더미데이터 삭제
     */
    private void deleteDummyData() {
        for(MembershipUsedHistory mbs : dummy) {
            mbsUsedHisRepository.delete(mbs);
        }
    }

}
