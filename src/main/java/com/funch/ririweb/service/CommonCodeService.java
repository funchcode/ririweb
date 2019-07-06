package com.funch.ririweb.service;

import com.funch.ririweb.domain.commons.CommonCode;
import com.funch.ririweb.domain.commons.CommonCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CommonCodeService {

    @Autowired
    private CommonCodeRepository commonCodeRepository;

    @Transactional
    public void enroll(CommonCode commonCode) {
        commonCodeRepository.save(commonCode);
    }

}
