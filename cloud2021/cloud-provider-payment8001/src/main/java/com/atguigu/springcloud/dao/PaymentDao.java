package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
//@Mapper
public interface PaymentDao {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);

}
