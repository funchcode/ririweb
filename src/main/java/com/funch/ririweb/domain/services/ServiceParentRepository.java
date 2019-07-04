package com.funch.ririweb.domain.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceParentRepository extends JpaRepository<ServiceParent, Integer> {
    ServiceParent findTopByOrderByParentPkDesc();
}
