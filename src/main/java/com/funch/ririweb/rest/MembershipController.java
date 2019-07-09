package com.funch.ririweb.rest;

import com.funch.ririweb.domain.memberships.Membership;
import com.funch.ririweb.domain.memberships.MembershipDTO;
import com.funch.ririweb.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mbs")
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody MembershipDTO membershipDTO) {
        membershipService.enroll(membershipDTO.toEntity());
    }

    /**
     * 사용|안함 멤버쉽 가져오기
     */
    @GetMapping("/get/all/{usedGb}")
    public List<Membership> getAllByWork(@PathVariable("usedGb") String usedGb) {

        return membershipService.getAllByUsed(usedGb);
    }

    /**
     * 특정 멤버쉽 정보 가져오기
     */
    @GetMapping("/get/{pk}")
    public Membership getOne(@PathVariable("pk") int membershipPk) {

        return membershipService.getOneByMembershipPk(membershipPk);
    }

    /**
     * 멤버쉽 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody MembershipDTO membershipDTO) {
        membershipService.update(membershipDTO.toEntity());
    }

}
