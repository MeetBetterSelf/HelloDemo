package com.yan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述：
 *
 * @author：yandehong
 * @createTime：2021/6/20 17:13
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello Index Page.";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "echo Hello Page.";
    }
}
