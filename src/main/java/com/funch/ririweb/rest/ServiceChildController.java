package com.funch.ririweb.rest;

import com.funch.ririweb.domain.services.ServiceChild;
import com.funch.ririweb.domain.services.ServiceChildDTO;
import com.funch.ririweb.service.ServiceChildService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/child")
@Slf4j
public class ServiceChildController {

    @Autowired
    private ServiceChildService serviceChildService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody ServiceChildDTO serviceChildDTO) {
        serviceChildService.enroll(serviceChildDTO.toEntity());
    }

    /**
     * 사용|안함 서비스 가져오기
     */
    @GetMapping("/get/all/{usedGb}")
    public List<ServiceChild> getAllByUsed(@PathVariable("usedGb") String usedGb) {

        return serviceChildService.getAllByUsed(usedGb);
    }

    /**
     * 특정 서비스 가져오기
     */
    @GetMapping("/get/{pk}")
    public ServiceChild getOne(@PathVariable("pk") int childPk) {

        return serviceChildService.getOneByChildPk(childPk);
    }

    /**
     * 서비스 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody ServiceChildDTO serviceChildDTO) {
        serviceChildService.update(serviceChildDTO.toEntity());
    }

}
