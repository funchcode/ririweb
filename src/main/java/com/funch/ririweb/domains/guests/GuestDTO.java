package com.funch.ririweb.domains.guests;

import com.funch.ririweb.domains.commons.AdType;
import com.funch.ririweb.domains.commons.GenderType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class GuestDTO {

    private String guestNm;
    private String phone;
    private GenderType genderGb;
    private AdType adGb;
    private LocalDate birthday;
    private String memo;
    private int guestFk;
    private int staffFk;

    public Guest toEntity() {
        return new Guest.Builder(guestNm, phone).adGb(adGb)
                .genderGb(genderGb).birthday(birthday).memo(memo).guestFk(guestFk)
                .staffFk(staffFk).build();
    }

}
