package com.funch.ririweb.domain.client;

import com.funch.ririweb.domain.client.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ClientDTO {

    private String name, phone, email, job, memo;

    private LocalDate birthday;

    private long staff;

    private char gender;

    public Client toEntity() {
        return Client.builder().name(name).phone(phone)
                .email(email).job(job).memo(memo).birthday(birthday)
                .staff(staff).gender(gender).build();
    }
}
