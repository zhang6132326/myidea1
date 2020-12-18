package com.zxf.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    public ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
