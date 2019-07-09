package com.funch.ririweb.rest;

import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryDTO;
import com.funch.ririweb.service.MembershipPurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mbs/purchase")
@Slf4j
public class MembershipPurchaseController {

    @Autowired
    private MembershipPurchaseService membershipPurchaseService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody MembershipPurchasedHistoryDTO membershipPurchasedHistoryDTO) {
        membershipPurchaseService.enroll(membershipPurchasedHistoryDTO.toEntity());
    }

    /**
     * 사용|안함 멤버쉽 구매 목록 가져오기
    */
    @GetMapping("/get/all/")
    public List<MembershipPurchasedHistory> getAllByWork() {
        return membershipPurchaseService.getAllByUsed();
    }

    /**
     * 특정 멤버쉽 정보 가져오기
     */
    @GetMapping("/get/{pk}")
    public MembershipPurchasedHistory getOne(@PathVariable("pk") int hisPurchasePk) {

        return membershipPurchaseService.getOneByHisPurchasePk(hisPurchasePk);
    }

    /**
     * 멤버쉽 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody MembershipPurchasedHistoryDTO membershipPurchasedHistoryDTO) {
        membershipPurchaseService.update(membershipPurchasedHistoryDTO.toEntity());
    }

}
