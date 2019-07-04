package com.funch.ririweb.domain.guest;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "GUEST")
public final class Guest extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guestno")
    private long guestNo;

    private String name;

    private String phone;

    private char gender;

    private String birthday;

    private String address;

    private char marriage;

    private String memo;

    @Column(name = "recommenderno")
    private int recommenderNo;

    private String job;

    @Column(name = "staffno")
    private int staffNo;

    @Column(name = "commoncodeno")
    private int commonCodeNo;

    public static class Builder {

        private final String name;
        private final String phone;
        private char gender;
        private String birthday;
        private String address;
        private char marriage;
        private String memo;
        private int recommenderNo;
        private String job;
        private int staffNo;
        private int commonCodeNo;

        public Builder(String name, String phone) {
            this.name     = name;
            this.phone    = phone;
            this.gender   = 'w';
            this.marriage = 'n';
        }

        public Builder gender(char val) {
            gender = val;
            return this;
        }

        public Builder birthday(String val) {
            birthday = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder marriage(char val) {
            marriage = val;
            return this;
        }

        public Builder memo(String val) {
            memo = val;
            return this;
        }

        public Builder staffNo(int val) {
            staffNo = val;
            return this;
        }

        public Builder commonCodeNo(int val) {
            commonCodeNo = val;
            return this;
        }

        public Builder recommenderNo(int val) {
            recommenderNo = val;
            return this;
        }

        public Builder job(String val) {
            job = val;
            return this;
        }

        public Guest build() {
            return new Guest(this);
        }

    }

    private Guest(Builder builder) {
        name = builder.name;
        phone = builder.phone;
        gender = builder.gender;
        birthday = builder.birthday;
        address = builder.address;
        marriage = builder.marriage;
        memo = builder.memo;
        recommenderNo = builder.recommenderNo;
        job = builder.job;
        staffNo = builder.staffNo;
        commonCodeNo = builder.commonCodeNo;
    }

}
