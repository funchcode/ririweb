package com.funch.ririweb.domain.client;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Builder
public class Client extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}
