package com.funch.ririweb.domain;

import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistory;
import com.funch.ririweb.domain.memberships.purchase.MembershipPurchasedHistoryRepository;
import com.funch.ririweb.domain.payments.Payment;
import com.funch.ririweb.domain.payments.PaymentRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentRepositoryTests {

    @Autowired
    private PaymentRepository paymentRepository;

    @Before
    public void 전처리() {

    }

    @Test
    public void 회원권_구매() {
        // TODO given
        Payment payment =
                new Payment.Builder(1000, 2000).card(2000).build();

        // TODO when
        paymentRepository.save(payment);
        Payment recentData = paymentRepository.findTopByOrderByPaymentPkDesc();

        // TODO then ( 만료 날로 비교 )
        Assert.assertEquals(payment.getCreatedAt(), recentData.getCreatedAt());
    }

    @After
    public void 후처리() {

    }

}
