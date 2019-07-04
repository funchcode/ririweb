package com.funch.ririweb.domain.creditor;

import com.funch.ririweb.domains.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CREDITOR")
@NoArgsConstructor
@Getter
public final class Creditor extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "creditorno")
    private long creditorNo;

    @NotNull
    private String name;

    private String supplier;

    private String phone;

    private char used;

    private String memo;

    public static class Builder {

        private final String name;
        private String supplier;
        private String phone;
        private char used;
        private String memo;

        public Builder(String name) {
            this.name = name;
            this.used = 'y';
        }

        public Builder supplier(String val) {
            supplier = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder used(char val) {
            used = val;
            return this;
        }

        public Builder memo(String val) {
            memo = val;
            return this;
        }

        public Creditor build() {
            return new Creditor(this);
        }

    }

    private Creditor(Builder builder) {
        name     = builder.name;
        supplier = builder.supplier;
        phone    = builder.phone;
        used     = builder.used;
        memo     = builder.memo;
    }

}
