package com.funch.ririweb.service;

import com.funch.ririweb.domain.services.ServiceChild;
import com.funch.ririweb.domain.services.ServiceChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceChildService {

    @Autowired
    private ServiceChildRepository serviceChildRepository;

    @Transactional
    public void enroll(ServiceChild serviceChild) {
        serviceChildRepository.save(serviceChild);
    }

    @Transactional
    public List<ServiceChild> getAllByUsed(String usedGb) {

        return serviceChildRepository.findAllByUsedGbOrderByChildPkDesc(usedGb);
    }

    @Transactional
    public ServiceChild getOneByChildPk(int childPk) {

        return serviceChildRepository.findByChildPk(childPk);
    }

    @Transactional
    public void update(ServiceChild serviceParent) {
        serviceChildRepository.save(serviceParent);
    }

}
