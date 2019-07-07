package com.funch.ririweb.rest;

import com.funch.ririweb.domain.commons.CommonCode;
import com.funch.ririweb.domain.commons.CommonCodeDTO;
import com.funch.ririweb.service.CommonCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/common/code")
@RestController
public class CommonCodeController {

    @Autowired
    private CommonCodeService commonCodeService;

    /**
     * 공통코드 등록
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody CommonCodeDTO commonCodeDTO) {
        log.debug(commonCodeDTO.toString());
    }

    /**
     * 코드 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody CommonCodeDTO commonCodeDTO) {
        log.debug(commonCodeDTO.toString());
    }

    /**
     * 그룹이름으로 검색
     */
    @GetMapping("/get/group/{name}")
    public List<CommonCode> getTarget(@PathVariable("name") String groupName) {
        log.debug(groupName);
        List<CommonCode> list = commonCodeService.getCodeByCodeGroup(groupName);
        log.debug("size() > " + list.size());
        return list;
    }

    /**
     * 사용유무 변경
     */
    @PutMapping("/use/{codePk}")
    public void updateUsed(@PathVariable("codePk") int codePk) {
        log.debug("" + codePk);
        commonCodeService.updateUsedYn(codePk);
    }

}
