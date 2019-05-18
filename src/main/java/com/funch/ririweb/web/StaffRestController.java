package com.funch.ririweb.web;

import com.funch.ririweb.domain.staff.StaffDTO;
import com.funch.ririweb.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
@AllArgsConstructor
public class StaffRestController {

    private StaffService staffService;

    @PostMapping("/enroll")
    public void enroll(@RequestBody StaffDTO staff) {
        
    }
}
