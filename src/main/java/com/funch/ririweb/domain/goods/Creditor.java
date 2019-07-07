package com.funch.ririweb.domain.goods;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.Code;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "GOODS_CREDITOR_TB")
public final class Creditor extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int creditorPk;
    private String creditorNm;
    private String supplier;
    private String phone;
    private String usedGb;
    private String memo;

    private Creditor(Builder builder) {
        this.creditorNm = builder.creditorNm;
        this.supplier   = builder.supplier;
        this.phone      = builder.phone;
        this.usedGb     = builder.usedGb;
        this.memo       = builder.memo;
    }

    public static class Builder {
        private final String creditorNm;
        private String supplier;
        private String phone;
        private String usedGb;
        private String memo;

        public Builder(String creditorNm) {
            this.creditorNm = creditorNm;
            /**
             * usedGb
             */
            this.usedGb = Code.USED_Y;
        }

        public Builder supplier(String val) {
            this.supplier = val;
            return this;
        }

        public Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Builder useGb(String val) {
            this.usedGb = val;
            return this;
        }

        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        public Creditor build() {
            return new Creditor(this);
        }
    }

}
