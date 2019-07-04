package com.funch.ririweb.domain.memberships.use;

import com.funch.ririweb.domain.memberships.MembershipRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipUsedHistoryRepository extends JpaRepository<MembershipUsedHistory, Integer> {
    MembershipUsedHistory findTopByOrderByHisUsedPkDesc();
}
