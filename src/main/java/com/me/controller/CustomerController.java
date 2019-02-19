package com.me.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: shimingming
 * @create: 2018-11-29
 * @description: 客户测试
 **/

@RestController
@Slf4j
public class CustomerController {

    @RequestMapping("/test")
    public String test(@RequestBody String str) {
        log.error("str的值是:{}", str);

        JSONObject jsonObject1 = JSON.parseObject(str);
        log.error("转换{}",jsonObject1.toJSONString());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","success");

        return jsonObject.toJSONString();

    }

    @RequestMapping("/time")
    public String time() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = simpleDateFormat.format(new Date());

        return format;

    }

}
