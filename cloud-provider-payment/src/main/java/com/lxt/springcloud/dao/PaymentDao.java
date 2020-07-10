package com.lxt.springcloud.dao;

import com.lxt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author IvXuTao
 * @Package com.lxt.springcloud.dao
 * @date 2020/7/7 22:27
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
