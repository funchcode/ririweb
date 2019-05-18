package com.funch.ririweb.domain.staff;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Staff extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long staffNo;

    @NotNull
    @Column(nullable = false)
    private String name;

    private LocalDate birthday;

    private String phone;

    private String part;

    private String state;

    private LocalDate startDate;

    private LocalDate resignationDate;

    private LocalDate careerDate;

    private char certificate;

    @Builder
    private Staff(String name, LocalDate birthday, String part, String state, String phone,
                    LocalDate startDate, LocalDate resignationDate, char certificate) {
        this.name = name;
        this.birthday = birthday;
        this.part = part;
        this.state = state;
        this.phone = phone;
        this.startDate = startDate;
        this.resignationDate = resignationDate;
        this.certificate = certificate;
    }
}
