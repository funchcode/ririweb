package com.nail.ririweb.domain.staff;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Staff {
    @Id
    private Integer staffNo;

    private String name;

    private Object birthday;

    private String phone;

    private String part;

    private String state;

    private Object startDate;

    private Object designationDate;

    private Object careerDate;

    private char certificate;

    private Object createdAt;

    private Object updatedAt;
}
