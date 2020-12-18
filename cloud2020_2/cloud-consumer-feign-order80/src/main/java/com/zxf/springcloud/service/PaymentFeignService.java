package com.zxf.springcloud.service;

import com.zxf.springcloud.entities.CommonResult;
import com.zxf.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-payment-service")//8001的yml定义的名称
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
   public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
   public String paymentFeignTimeout();
}
