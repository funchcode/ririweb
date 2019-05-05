package com.funch.ririweb.domain.product;

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
@Getter
@Builder
public class Product extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productNo;

    @NotNull
    @Column(nullable = false)
    private String name;

    private double inPrice;

    private double salePrice;

    private String state;

    private int stock;

    private String memo;
}
