package com.funch.ririweb.domain.staffs;

import com.funch.ririweb.domain.BaseTimeEntity;
import com.funch.ririweb.domain.commons.GenderType;
import com.funch.ririweb.domain.commons.PartType;
import com.funch.ririweb.domain.commons.WorkType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "STAFFS_TB")
public final class Staff extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffPk;
    private String staffNm;
    private String phone;
    private String genderGb;
    private String partGb;
    private String workGb;
    private LocalDate birthday;
    private String address;
    private String email;
    private int preCareer;
    private String memo;
    private LocalDate hiredDay;
    private LocalDate resignedDay;

    private Staff(Builder builder) {
        staffNm   = builder.staffNm;
        phone     = builder.phone;
        genderGb  = builder.genderGb;
        partGb    = builder.partGb;
        workGb    = builder.workGb;
        birthday  = builder.birthday;
        address   = builder.address;
        email     = builder.email;
        preCareer = builder. preCareer;
        memo      = builder.memo;
        hiredDay  = builder.hiredDay;
        resignedDay = builder.resignedDay;
    }

    public static class Builder {
        private final String staffNm;
        private final String phone;
        private String genderGb;
        private String partGb;
        private String workGb;
        private LocalDate birthday;
        private String address;
        private String email;
        private int preCareer;
        private String memo;
        private final LocalDate hiredDay;
        private LocalDate resignedDay;

        public Staff build() {
            return new Staff(this);
        }

        public Builder resignedDay(LocalDate val) {
            resignedDay = val;
            return this;
        }

        public Builder memo(String val) {
            memo = val;
            return this;
        }

        public Builder preCareer(int val) {
            preCareer = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder birthday(LocalDate val) {
            birthday = val;
            return this;
        }

        public Builder workGb(WorkType val) {
            workGb = val.getValue();
            return this;
        }

        public Builder partGb(PartType val) {
            partGb = val.getValue();
            return this;
        }

        public Builder genderGb(GenderType val) {
            genderGb = val.getValue();
            return this;
        }

        public Builder(String staffNm, String phone, LocalDate hiredDay) {
            this.staffNm = staffNm;
            this.phone = phone;
            this.hiredDay = hiredDay;
            /**
             * genderGB default
             */
            this.genderGb = GenderType.WOMAN.getValue();
            /**
             * partGB default
             */
            this.partGb = PartType.NAIL.getValue();
            /**
             * workGB default
             */
            this.workGb = WorkType.WORK.getValue();
        }
    }

}
