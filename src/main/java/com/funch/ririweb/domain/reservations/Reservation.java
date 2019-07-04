package com.funch.ririweb.domain.reservations;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.StatusType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "RESERVATIONS_TB")
public final class Reservation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationPk;
    private String reservationStGb;
    private LocalDateTime visitedTime;
    private LocalDateTime finishedTime;
    private int guestFk;
    private int staffFk;

    private Reservation(Builder builder) {
        this.reservationStGb = builder.reservationStGb;
        this.visitedTime = builder.visitedTime;
        this.finishedTime = builder.finishedTime;
        this.guestFk = builder.guestFk;
        this.staffFk = builder.staffFk;
    }

    public static class Builder {
        private String reservationStGb;
        private final LocalDateTime visitedTime;
        private LocalDateTime finishedTime;
        private int guestFk;
        private int staffFk;

        public Reservation build() {
            return new Reservation(this);
        }

        public Builder staffFk(int val) {
            this.staffFk = val;
            return this;
        }

        public Builder guestFk(int val) {
            this.guestFk = val;
            return this;
        }

        public Builder finishedTime(LocalDateTime val) {
            this.finishedTime = val;
            return this;
        }

        public Builder reservationStGb(StatusType val) {
            this.reservationStGb = val.getValue();
            return this;
        }

        public Builder(LocalDateTime visitedTime) {
            this.visitedTime = visitedTime;
            /**
             * reservation GB default
             */
            this.reservationStGb = StatusType.STANDBY.getValue();
        }
    }
}
