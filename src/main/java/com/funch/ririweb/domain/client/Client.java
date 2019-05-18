package com.funch.ririweb.domain.client;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Client extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientNo;

    @NotNull
    @Column(nullable = false)
    private String name;

    private LocalDate birthday;

    private String phone;

    private long staff;

    private String email;

    private char gender;

    private String job;

    private String memo;

    @Builder
    private Client(String name, LocalDate birthday, String phone, long staff, String email,
                   char gender, String job, String memo) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.staff = staff;
        this.email = email;
        this.gender = gender;
        this.job = job;
        this.memo = memo;
    }
}
