package com.funch.ririweb.domain.cservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CServiceRepository extends JpaRepository<CService, Long> {
    CService findTopByCname(String cname);
}
