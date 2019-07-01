package com.funch.ririweb.domain.creditor;

import com.funch.ririweb.domain.BaseTimeEntity;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CREDITOR")
@NoArgsConstructor
public class Creditor extends BaseTimeEntity {

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

    public long getCreditorNo() {
        return this.creditorNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsed(char used) {
        this.used = used;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public static class Builder {

        private String name;
        private String supplier;
        private String phone;
        private char used;
        private String memo;

        public Builder(String name) {
            this.name = name;
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
