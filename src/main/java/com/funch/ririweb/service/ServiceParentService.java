package com.funch.ririweb.service;

import com.funch.ririweb.domain.services.ServiceParent;
import com.funch.ririweb.domain.services.ServiceParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceParentService {

    @Autowired
    private ServiceParentRepository serviceParentRepository;

    @Transactional
    public void enroll(ServiceParent serviceParent) {
        serviceParentRepository.save(serviceParent);
    }

    @Transactional
    public List<ServiceParent> getAllByUsed(String usedGb) {

        return serviceParentRepository.findAllByUsedGbOrderByParentPkDesc(usedGb);
    }

    @Transactional
    public ServiceParent getOneByParentPk(int parentPk) {

        return serviceParentRepository.findByParentPk(parentPk);
    }

    @Transactional
    public void update(ServiceParent serviceParent) {
        serviceParentRepository.save(serviceParent);
    }

}
