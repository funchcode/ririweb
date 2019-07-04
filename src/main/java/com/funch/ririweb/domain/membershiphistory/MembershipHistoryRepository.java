package com.funch.ririweb.domain.membershiphistory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipHistoryRepository extends JpaRepository<MembershipHistory, Long> {
    MembershipHistory findTopByOrderByMembershipHistoryNoDesc();
}
