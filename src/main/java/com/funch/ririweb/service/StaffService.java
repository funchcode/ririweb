package com.funch.ririweb.service;

import com.funch.ririweb.domain.staff.Staff;
import com.funch.ririweb.domain.staff.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class StaffService {

    private StaffRepository staffRepository;

    /*직원등록*/
    @Transactional
    public void enroll(Staff staff) {

    }

    /*직원정보수정*/
    @Transactional
    public void modify(Staff staff) {

    }

}
