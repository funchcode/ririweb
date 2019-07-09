package com.funch.ririweb.rest;

import com.funch.ririweb.domain.services.ServiceParent;
import com.funch.ririweb.domain.services.ServiceParentDTO;
import com.funch.ririweb.service.ServiceParentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/service/parent")
public class ServiceParentController {

    @Autowired
    private ServiceParentService serviceParentService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody ServiceParentDTO serviceParentDTO) {
        serviceParentService.enroll(serviceParentDTO.toEntity());
    }

    /**
     * 사용|안함 서비스 가져오기
     */
    @GetMapping("/get/all/{usedGb}")
    public List<ServiceParent> getAllByUsed(@PathVariable("usedGb") String usedGb) {

        return serviceParentService.getAllByUsed(usedGb);
    }

    /**
     * 특정 서비스 가져오기
     */
    @GetMapping("/get/{pk}")
    public ServiceParent getOne(@PathVariable("pk") int parentPk) {
        return serviceParentService.getOneByParentPk(parentPk);
    }

    /**
     * 서비스 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody ServiceParentDTO serviceParentDTO) {
        serviceParentService.update(serviceParentDTO.toEntity());
    }

}
