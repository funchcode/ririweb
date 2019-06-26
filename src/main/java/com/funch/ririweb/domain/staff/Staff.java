package com.funch.ririweb.domain.staff;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Staff extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long staffNo;

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

}
