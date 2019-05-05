package com.funch.ririweb.domain.membershipList;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
public class MembershipList extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long membershipListNo;

    @NotNull
    @Column(nullable = false)
    private long membershipNo;

    @NotNull
    @Column(nullable = false)
    private long clientNo;

    private double restPrice;
}
