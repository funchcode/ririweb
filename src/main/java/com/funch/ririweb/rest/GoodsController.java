package com.funch.ririweb.rest;

import com.funch.ririweb.domain.goods.Goods;
import com.funch.ririweb.domain.goods.GoodsDTO;
import com.funch.ririweb.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/goods")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 상품 등록하기
     */
    @PostMapping("/enroll")
    public void enroll(@RequestBody GoodsDTO goodsDTO) {
        goodsService.enroll(goodsDTO.toEntity());
    }
    /**
     * 사용|안함 상품 가져오기
     */
    @GetMapping("/get/all/{usedGb}")
    public List<Goods> getAllByUsed(@PathVariable("usedGb") String usedGb) {
        List<Goods> list = goodsService.getAllByUsed(usedGb);
        return list;
    }
    /**
     * 특정 상품 가져오기
     */
    @GetMapping("/get/{goodsPk}")
    public Goods getOne(@PathVariable("goodsPk") int goodsPk) {
        Goods goods = goodsService.getOneByGoodsPk(goodsPk);

        return goods;
    }
    /**
     * 상품 정보 수정
     */
    @PutMapping("/update")
    public void update(@RequestBody GoodsDTO goodsDTO) {
        goodsService.update(goodsDTO.toEntity());
    }
}
