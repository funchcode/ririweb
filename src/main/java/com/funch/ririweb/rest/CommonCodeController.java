package com.funch.ririweb.rest;

import com.funch.ririweb.domain.commons.CommonCodeDTO;
import com.funch.ririweb.service.CommonCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/common/code")
@RestController
public class CommonCodeController {

    @Autowired
    private CommonCodeService commonCodeService;

    @PostMapping("/enroll")
    public void enroll(@RequestBody CommonCodeDTO commonCodeDTO) {

    }

}
