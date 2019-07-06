package com.funch.ririweb.rest;

import com.funch.ririweb.domain.goods.CreditorDTO;
import com.funch.ririweb.service.CreditorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("/creditor")
public class CreditorController {

    @Autowired
    private CreditorService creditorService;

    @PostMapping("/create")
    public void create(@RequestBody CreditorDTO creditorDTO) {
        log.info(creditorDTO.toString());
        creditorService.enroll(creditorDTO.toEntity());
    }

}
