package com.funch.ririweb.domain.reservation;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Reservation extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationNo;

    private LocalDateTime visitTime;

    private LocalDateTime finishTime;

    private long cserviceHistoryNo;

    private long staffNo;

    private long guestNo;

    private long commonCodeNo;

}
