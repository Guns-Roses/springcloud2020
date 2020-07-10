package com.lxt.springcloud.controller;

import com.lxt.springcloud.entities.CommonResult;
import com.lxt.springcloud.entities.Payment;
import com.lxt.springcloud.serivce.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author IvXuTao
 * @Package com.lxt.springcloud.controller
 * @date 2020/7/7 22:48
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {

        int result = paymentService.create(payment);
        log.info("*****插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);

        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询成功:" + payment);
        if (payment != null) {
            return new CommonResult(200, "插入数据库成功", payment);

        } else {
            return new CommonResult(444, "没有对应记录", null);
        }
    }
}
