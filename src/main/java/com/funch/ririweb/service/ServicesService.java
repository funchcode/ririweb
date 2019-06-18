package com.funch.ririweb.service;

import com.funch.ririweb.domain.services.Services;
import com.funch.ririweb.domain.services.ServicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class ServicesService {

    private ServicesRepository servicesRepository;

    @Transactional
    public void insertServices(Services services) {
        Services origin = servicesRepository.findTopByCategoryNoAndName(services.getCategoryNo(),
                services.getName());

        if(origin == null) {
            servicesRepository.save(services);
        }
    }
}
