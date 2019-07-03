package com.funch.ririweb.domain.staff;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findTopByName(String name);
}
