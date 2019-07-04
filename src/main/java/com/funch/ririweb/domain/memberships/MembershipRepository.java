package com.funch.ririweb.domain.memberships;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
    Membership findTopByOrderByMembershipPkDesc();
}
