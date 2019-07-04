package com.funch.ririweb.domain.staff;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "STAFF")
@Getter
public final class Staff extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staffno")
    private long staffNo;

    private String name;

    private String phone;

    private char gender;

    private LocalDate birthday;

    private String address;

    private String email;

    private char marriage;

    private int part;

    private int career;

    private char license;

    private String memo;

    @Column(name = "hiredday")
    private LocalDate hiredDay;

    public static class Builder {

        private String name;
        private String phone;
        private char gender;
        private LocalDate birthday;
        private String address;
        private String email;
        private char marriage;
        private int part;
        private int career;
        private char license;
        private String memo;
        private LocalDate hiredDay;

        public Builder(String name, String phone, int part, LocalDate hiredDay) {
            this.name     = name;
            this.phone    = phone;
            this.part     = part;
            this.hiredDay = hiredDay;
            this.gender   = 'w';
            this.marriage = 'n';
            this.license  = 'y';
        }

        public Builder gender(char val) {
            gender = val;
            return this;
        }

        public Builder birthday(LocalDate val) {
            birthday = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder marriage(char val) {
            marriage = val;
            return this;
        }

        public Builder career(int val) {
            career = val;
            return this;
        }

        public Builder license(char val) {
            license = val;
            return this;
        }

        public Builder memo(String val) {
            memo = val;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }

    }

    private Staff(Builder builder) {
        name     = builder.name;
        phone    = builder.phone;
        gender   = builder.gender;
        birthday = builder.birthday;
        address  = builder.address;
        email    = builder.email;
        marriage = builder.marriage;
        part     = builder.part;
        career   = builder.career;
        license  = builder.license;
        memo     = builder.memo;
        hiredDay = builder.hiredDay;
    }
}
