package com.funch.ririweb.service;

import com.funch.ririweb.domain.memberships.Membership;
import com.funch.ririweb.domain.memberships.MembershipRepository;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistory;
import com.funch.ririweb.domain.memberships.use.MembershipUsedHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MembershipUsedService {

    @Autowired
    private MembershipUsedHistoryRepository mbsUsedHisRepository;
    @Autowired
    private MembershipRepository mbsRepository;

    @Transactional
    public MembershipUsedHistory enrollFirst(MembershipPurchasedHistory mbsPurchasedH) {
        Membership findMbs = mbsRepository.findByMembershipPk(mbsPurchasedH.getMembershipFk());
        int purchasedFk = mbsPurchasedH.getHisPurchasePk();
        int usedPrice = 0;
        int balance = findMbs.getChargePrice();

        MembershipUsedHistory inputMbsUsedH =
                new MembershipUsedHistory(purchasedFk,usedPrice,balance);

        return mbsUsedHisRepository.save(inputMbsUsedH);
    }

}
