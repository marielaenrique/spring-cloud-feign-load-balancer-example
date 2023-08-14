package com.dh.course.feign;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("subscription-service")
@LoadBalancerClient(value = "subscription-service", configuration = FeignConfiguration.class)
public interface ISubscriptionClient {

    @GetMapping("/subscription/find")
    public String find();

}