package com.funch.ririweb.domain.services;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "SERVICE")
public class Services extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long serviceNo;

    @NotNull
    @Column(nullable = false)
    private long categoryNo;

    @NotNull
    @Column(nullable = false)
    private String name;

    private double price;

    @Setter
    @NotNull
    @Column(nullable = false)
    private char useYn;

    @Builder
    private Services(long categoryNo, String name, double price, char useYn) {
        this.categoryNo = categoryNo;
        this.name = name;
        this.price = price;
        this.useYn = useYn;
    }
}
