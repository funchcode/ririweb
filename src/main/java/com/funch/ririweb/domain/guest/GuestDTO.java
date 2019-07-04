package com.funch.ririweb.domain.guest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GuestDTO {

    private String name;
    private String phone;
    private char gender;
    private String birthday;
    private String address;
    private char marriage;
    private String memo;
    private int recommenderNo;
    private String job;
    private int staffNo;
    private int commonCodeNo;

    public Guest toEntity() {
        return new Guest.Builder(name, phone).gender(gender).birthday(birthday).address(address)
                .marriage(marriage).memo(memo).recommenderNo(recommenderNo).job(job).staffNo(staffNo)
                .commonCodeNo(commonCodeNo).build();
    }

}
