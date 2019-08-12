package com.funch.ririweb.domain.guests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public final class GuestDTO {

    private String guestNm;
    private String phone;
    private String genderGb;
    private String adGb;
    private LocalDate birthday;
    private String memo;
    private int guestFk;
    private int staffFk;

    public Guest toEntity() {
        return new Guest.Builder(guestNm, phone).adGb(adGb)
                .genderGb(genderGb).birthday(birthday).memo(memo).guestFk(guestFk)
                .staffFk(staffFk).build();
    }

    public boolean validation() {
        return !("".equals(this.guestNm) || this.guestNm == null
                || "".equals(this.phone) || this.phone == null);
    }
}
