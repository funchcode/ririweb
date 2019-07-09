package com.funch.ririweb.rest;

import com.funch.ririweb.domain.guests.Guest;
import com.funch.ririweb.domain.guests.GuestDTO;
import com.funch.ririweb.domain.guests.GuestRepository;
import com.funch.ririweb.service.GuestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
@Slf4j
public class GuestController {

    @Autowired
    private GuestService guestService;

    /**
     * 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody GuestDTO guestDTO) {
        guestService.enroll(guestDTO.toEntity());
    }

    /**
     * 사용|안함 서비스 가져오기
     */
    @GetMapping("/get/all")
    public List<Guest> getAll() {

        return guestService.getAll();
    }

    /**
     * 특정 서비스 가져오기
     */
    @GetMapping("/get/{pk}")
    public Guest getOne(@PathVariable("pk") int guestPk) {

        return guestService.getOneByGuestPk(guestPk);
    }

    /**
     * 서비스 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody GuestDTO guestDTO) {
        guestService.update(guestDTO.toEntity());
    }

}
