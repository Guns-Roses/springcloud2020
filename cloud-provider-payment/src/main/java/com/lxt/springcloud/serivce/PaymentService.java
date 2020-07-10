package com.lxt.springcloud.serivce;

import com.lxt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author IvXuTao
 * @Package com.lxt.springcloud.serivce
 * @date 2020/7/7 22:44
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
