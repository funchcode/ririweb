package com.funch.ririweb.domain.membership;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
    Membership findTopByOrderByMembershipNoDesc();
}
