package com.funch.ririweb.domain.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicesRepository extends JpaRepository<Services, Long> {
    List<Services> findByCategoryNoOrderByServiceNoAsc(long categoryNo);
}
