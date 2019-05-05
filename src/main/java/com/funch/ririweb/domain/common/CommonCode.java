package com.funch.ririweb.domain.common;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Builder
@Getter
public class CommonCode extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commonCodeNo;

    private String codeName;

    @NotNull
    @Column(nullable = false)
    private char useYn;
}
