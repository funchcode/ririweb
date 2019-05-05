package com.funch.ririweb.domain.salesHistory;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class SalesHistory extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long salesHistoryNo;

    private long salesNo;

    private long serviceNo;

    private long productNo;

    private int count;

    @NotNull
    @Column(nullable = false)
    private char cancelYn;
}
