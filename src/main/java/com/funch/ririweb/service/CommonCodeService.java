package com.funch.ririweb.service;

import com.funch.ririweb.domain.commons.CommonCode;
import com.funch.ririweb.domain.commons.CommonCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CommonCodeService {

    private final char ENABLE = 'Y';
    private final char DISABLE = 'N';

    @Autowired
    private CommonCodeRepository commonCodeRepository;

    @Transactional
    public void enroll(CommonCode commonCode) {
        commonCodeRepository.save(commonCode);
    }

    @Transactional
    public List<CommonCode> getCodeByCodeGroup(String groupName) {
        List<CommonCode> codeList
                = commonCodeRepository.findAllByCodeGbOrderByCodePkAsc(groupName);
        return codeList;
    }

    @Transactional
    public void updateUsedYn(int codePk) {
        CommonCode code = commonCodeRepository.findByCodePk(codePk);
        char usedYn = ENABLE;

        if( code.getUsedGb() == ENABLE )
            usedYn = DISABLE;

        commonCodeRepository.setUsedYnByCodePk(codePk, usedYn);
    }

}
