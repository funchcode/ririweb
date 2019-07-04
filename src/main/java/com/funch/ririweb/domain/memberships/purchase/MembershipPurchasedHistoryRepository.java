package com.funch.ririweb.domain.memberships.purchase;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipPurchasedHistoryRepository extends JpaRepository<MembershipPurchasedHistory, Integer> {
    MembershipPurchasedHistory findTopByOrderByMembershipFkDesc();
}
