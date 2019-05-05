package com.funch.ririweb.domain.sales;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

public class SalesRepositoryTests {
    @Autowired
    SalesRepository salesRepository;

    @Test
    public void 매출_등록_테스트() {
        // given
        Sales sales = Sales.builder().staffNo(10).reservationNo(11).commonCodeNo(4)
                .serviceNo(9).build();
        List<Sales> result;

        // when
        salesRepository.save(sales);
        result = salesRepository.findAll();

        // then
        Assert.assertEquals(result.get(0).getStaffNo(), sales.getStaffNo());
    }
}
