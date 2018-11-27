package com.controller;

import com.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：linma
 * @date: 2018/11/21 17:39
 * @email: linma@homeinns.com
 **/
@RestController
@RequestMapping("/homeinns")
public class ResourcesController {

    @Autowired
    private FeignTest feignTest;

    @GetMapping("/test")
    public String test() {
        return feignTest.feign();
    }

}
