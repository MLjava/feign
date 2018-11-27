package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author：linma
 * @date: 2018/11/23 10:12
 * @email: linma@homeinns.com
 *  注解绑定的是微服务的名字
 * */
@FeignClient(value = "mybatis")
@Component
public interface FeignTest {

    /**
     * 测试fegin接口
     *
     * @return
     */
    @GetMapping("/homeinns/congratulations")
    String feign();

}
