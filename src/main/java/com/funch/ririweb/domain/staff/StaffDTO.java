package com.funch.ririweb.domain.staff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class StaffDTO {
    private String name, phone, part, state;
    private LocalDate birthday, startDate, resignationDate;
    private char certificate;

    public Staff toEntity() {
        return Staff.builder().name(name).phone(phone).part(part).state(state).birthday(birthday)
                .startDate(startDate).resignationDate(resignationDate).certificate(certificate).build();
    }
}
