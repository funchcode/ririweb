package com.funch.ririweb.web;

import com.funch.ririweb.domain.client.ClientDTO;
import com.funch.ririweb.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/custom")
@AllArgsConstructor
public class ClientRestController {

    private ClientService clientService;

    @PostMapping("/enroll")
    public void insertClient(@RequestBody ClientDTO client) {
        clientService.enroll(client.toEntity());
    }

    @PostMapping("/modify")
    public ResponseStatus modifyClient(@RequestBody ClientDTO client) {

        return null;
    }

    @PostMapping("/blackList")
    public ResponseStatus blackListClient(@RequestBody ClientDTO client) {

        return null;
    }
}
