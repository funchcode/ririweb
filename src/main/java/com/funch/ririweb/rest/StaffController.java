package com.funch.ririweb.rest;

import com.funch.ririweb.domain.staffs.Staff;
import com.funch.ririweb.domain.staffs.StaffDTO;
import com.funch.ririweb.service.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
@Slf4j
public class StaffController {

    @Autowired
    private StaffService staffService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody StaffDTO staffDTO) {
        staffService.enroll(staffDTO.toEntity());
    }

    /**
     * 근무|퇴사 직원 가져오기
     */
    @GetMapping("/get/all/{work}")
    public List<Staff> getAllByWork(@PathVariable("work") String workGb) {

        return staffService.getAllByWork(workGb);
    }

    /**
     * 특정 직원 정보 가져오기
     */
    @GetMapping("/get/{pk}")
    public Staff getOne(@PathVariable("pk") int staffPk) {

        return staffService.getOneByStaffPk(staffPk);
    }

    /**
     * 직원 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody StaffDTO staffDTO) {
        staffService.update(staffDTO.toEntity());
    }

}