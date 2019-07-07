package com.funch.ririweb.domain.staffs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public final class StaffDTO {

    private String staffNm;
    private String phone;
    private String genderGb;
    private String partGb;
    private String workGb;
    private LocalDate birthday;
    private String address;
    private String email;
    private int preCareer;
    private String memo;
    private LocalDate hiredDay;
    private LocalDate resignedDay;

    public Staff toEntity() {
        return new Staff.Builder(staffNm, phone, hiredDay).address(address)
                .birthday(birthday).email(email).genderGb(genderGb).memo(memo)
                .partGb(partGb).preCareer(preCareer).resignedDay(resignedDay).workGb(workGb).build();
    }

}
