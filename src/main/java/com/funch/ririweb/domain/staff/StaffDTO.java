package com.funch.ririweb.domain.staff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class StaffDTO {

    private String name;
    private String phone;
    private char gender;
    private LocalDate birthday;
    private String address;
    private String email;
    private char marriage;
    private int part;
    private int career;
    private char license;
    private String memo;
    private LocalDate hiredDay;

    public Staff toEntity() {
        return new Staff.Builder(name, phone, part, hiredDay)
                .address(address).birthday(birthday).career(career).email(email)
                .gender(gender).license(license).marriage(marriage).memo(memo).build();
    }

}
