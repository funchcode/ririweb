package com.funch.ririweb.service;

import com.funch.ririweb.domain.staffs.Staff;
import com.funch.ririweb.domain.staffs.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Transactional
    public void enroll(Staff staff) {
        staffRepository.save(staff);
    }

    @Transactional
    public List<Staff> getAllByWork(String workGb) {

        return staffRepository.findAllByWorkGbOrderByStaffPkDesc(workGb);
    }

    @Transactional
    public Staff getOneByStaffPk(int staffPk) {

        return staffRepository.findByStaffPk(staffPk);
    }

    @Transactional
    public void update(Staff staff) {
        staffRepository.save(staff);
    }

}
