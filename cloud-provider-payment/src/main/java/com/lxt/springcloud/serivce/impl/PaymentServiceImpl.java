package com.lxt.springcloud.serivce.impl;

import com.lxt.springcloud.dao.PaymentDao;
import com.lxt.springcloud.entities.Payment;
import com.lxt.springcloud.serivce.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author IvXuTao
 * @Package com.lxt.springcloud.serivce.impl
 * @date 2020/7/7 22:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
