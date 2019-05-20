package com.funch.ririweb.domain.staff;

import org.hibernate.internal.SessionImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findByNameAndPhone(String name, String phone);
}
