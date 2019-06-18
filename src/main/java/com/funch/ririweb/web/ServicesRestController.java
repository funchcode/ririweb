package com.funch.ririweb.web;

import com.funch.ririweb.domain.services.ServicesDTO;
import com.funch.ririweb.service.ServicesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
@AllArgsConstructor
public class ServicesRestController {

    private ServicesService servicesService;

    @PostMapping("/enroll")
    public void enroll(@RequestBody ServicesDTO services) {
        servicesService.insertServices(services.toEntity());
    }
}
