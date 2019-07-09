package com.funch.ririweb.domain.memberships;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
    Membership findTopByOrderByMembershipPkDesc();

    List<Membership> findAllByUsedGbOrderByMembershipPkDesc(String usedGb);

    Membership findByMembershipPk(int membershipPk);
}
