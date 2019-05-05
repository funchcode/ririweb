package com.funch.ririweb.domain.staff;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
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
}
