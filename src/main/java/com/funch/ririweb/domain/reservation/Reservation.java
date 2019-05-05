package com.funch.ririweb.domain.reservation;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class Reservation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationNo;

    @NotNull
    @Column(nullable = false)
    private long clientNo;

    @NotNull
    @Column(nullable = false)
    private long staffNo;

    @NotNull
    @Column(nullable = false)
    private long serviceNo;

    private LocalDateTime time;

    private String state;

    private String memo;
}
