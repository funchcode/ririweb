package com.funch.ririweb.service;

import com.funch.ririweb.domain.services.ServiceParent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ServiceParentService {

    @Autowired
    private ServiceParentService serviceParentService;

    @Transactional
    public void enroll(ServiceParent serviceParent) {

    }

}
