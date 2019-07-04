package com.funch.ririweb.domain.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceChildRepository extends JpaRepository<ServiceChild, Integer> {
    ServiceChild findTopByOrderByChildPkDesc();
}
