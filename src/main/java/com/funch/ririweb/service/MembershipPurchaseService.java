package com.funch.ririweb.service;

import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MembershipPurchaseService {

    @Autowired
    private MembershipPurchasedHistoryRepository membershipPurchasedHistoryRepository;

    /**
     * 최초 등록 시 MembershipUsed 에도 기록
     */
    @Transactional
    public void enroll(MembershipPurchasedHistory membershipPurchasedHistory) {
        membershipPurchasedHistoryRepository.save(membershipPurchasedHistory);
    }

    @Transactional
    public List<MembershipPurchasedHistory> getAllByUsed() {

        return membershipPurchasedHistoryRepository.findAllByOrderByHisPurchasePkDesc();
    }

    @Transactional
    public MembershipPurchasedHistory getOneByHisPurchasePk(int hisPurchasePk) {

        return membershipPurchasedHistoryRepository.findByHisPurchasePk(hisPurchasePk);
    }

    @Transactional
    public void update(MembershipPurchasedHistory membershipPurchasedHistory) {
        membershipPurchasedHistoryRepository.save(membershipPurchasedHistory);
    }

}
