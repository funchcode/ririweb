package com.funch.ririweb.domain.guests;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.AdType;
import com.funch.ririweb.domain.commons.GenderType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "GUESTS_TB")
public final class Guest extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guestPk;
    private String guestNm;
    private String phone;
    private String genderGb;
    @Column(name = "ad_gb")
    private String adGb;
    private LocalDate birthday;
    private String memo;
    @Column(name = "guest_recommender_fk")
    private int guestFk;
    private int staffFk;

    private Guest(Builder builder) {
        this.guestNm = builder.guestNm;
        this.phone = builder.phone;
        this.genderGb = builder.genderGb;
        this.adGb = builder.adGb;
        this.birthday = builder.birthday;
        this.memo = builder.memo;
        this.guestFk = builder.guestFk;
        this.staffFk = builder.staffFk;
    }

    public static class Builder {
        private final String guestNm;
        private final String phone;
        private String genderGb;
        private String adGb;
        private LocalDate birthday;
        private String memo;
        private int guestFk;
        private int staffFk;

        public Guest build() {
            return new Guest(this);
        }

        public Builder staffFk(int val) {
            this.staffFk = val;
            return this;
        }

        public Builder guestFk(int val) {
            this.guestFk = val;
            return this;
        }

        public Builder memo(String val) {
            this.memo = val;
            return this;
        }

        public Builder birthday(LocalDate val) {
            this.birthday = val;
            return this;
        }

        public Builder adGb(AdType val) {
            this.adGb = val.getValue();
            return this;
        }

        public Builder genderGb(GenderType val) {
            this.genderGb = val.getValue();
            return this;
        }

        public Builder(String guestNm, String phone) {
            this.guestNm = guestNm;
            this.phone = phone;
            /**
             * AD_GB Default
             */
            this.adGb = AdType.WALKING.getValue();
            /**
             * GENDER_GB Default
             */
            this.genderGb = GenderType.WOMAN.getValue();
        }
    }
}
