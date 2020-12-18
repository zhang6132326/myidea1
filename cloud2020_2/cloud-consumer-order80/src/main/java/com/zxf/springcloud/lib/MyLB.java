package com.zxf.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current=this.atomicInteger.get();
            next=current>=Integer.MAX_VALUE?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***next:"+next);
        return next;
    }
    /*
       负载均衡算法：
       rest接口第几次请求数%服务器集群数量=实际调用服务器位置下标
       每次服务重启后rest接口计数从1开始。
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index=getAndIncrement()%serviceInstances.size();

        return serviceInstances.get(index);
    }
}