package com.funch.ririweb.domain.pservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PServiceRepository extends JpaRepository<PService, Long> {
    PService findTopByPname(String pName);
}
