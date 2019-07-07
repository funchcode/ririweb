package com.funch.ririweb.rest;

import com.funch.ririweb.domain.goods.Creditor;
import com.funch.ririweb.domain.goods.CreditorDTO;
import com.funch.ririweb.service.CreditorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/creditor")
public class CreditorController {

    @Autowired
    private CreditorService creditorService;

    /**
     * 매입처등록
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody CreditorDTO creditorDTO) {
        log.info(creditorDTO.toString());
        creditorService.enroll(creditorDTO.toEntity());
    }

    /**
     * ALL 가져오기
     */
    @GetMapping("/get/all/{usedGb}")
    public List<Creditor> getAllByUsed(@PathVariable("usedGb") String usedGb) {
        log.info(usedGb);
        List<Creditor> list = creditorService.getAllByUsed(usedGb);
        return list;
    }

    /**
     * 특정 매입처 정보 가져오기
     */
    @GetMapping("/get/{creditorPk}")
    public Creditor getOne(@PathVariable("creditorPk") int creditorPk) {
        log.info("" + creditorPk);
        Creditor creditor = creditorService.getOneByCreditorPk(creditorPk);
        return creditor;
    }

    /**
     * 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody CreditorDTO creditorDTO) {
        log.info(creditorDTO.toString());
        creditorService.update(creditorDTO.toEntity());
    }
}
