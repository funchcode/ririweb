package com.funch.ririweb.domain.memberships.purchase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembershipPurchasedHistoryRepository extends JpaRepository<MembershipPurchasedHistory, Integer> {
    MembershipPurchasedHistory findTopByOrderByMembershipFkDesc();

    List<MembershipPurchasedHistory> findAllByOrderByHisPurchasePkDesc();

    MembershipPurchasedHistory findByHisPurchasePk(int hisPurchasePk);
}
