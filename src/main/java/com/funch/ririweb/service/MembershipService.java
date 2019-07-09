package com.funch.ririweb.service;

import com.funch.ririweb.domain.memberships.Membership;
import com.funch.ririweb.domain.memberships.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MembershipService {

    @Autowired
    private MembershipRepository membershipRepository;

    @Transactional
    public void enroll(Membership guest) {
        membershipRepository.save(guest);
    }

    @Transactional
    public List<Membership> getAllByUsed(String usedGb) {

        return membershipRepository.findAllByUsedGbOrderByMembershipPkDesc(usedGb);
    }

    @Transactional
    public Membership getOneByMembershipPk(int membershipPk) {

        return membershipRepository.findByMembershipPk(membershipPk);
    }

    @Transactional
    public void update(Membership guest) {
        membershipRepository.save(guest);
    }

}
