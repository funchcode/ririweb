package com.funch.ririweb.domain.staffs;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    Staff findTopByOrderByStaffPkDesc();

    List<Staff> findAllByWorkGbOrderByStaffPkDesc(String workGb);

    Staff findByStaffPk(int staffPk);
}
