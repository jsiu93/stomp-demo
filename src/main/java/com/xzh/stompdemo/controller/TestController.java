package com.xzh.stompdemo.controller;

import com.xzh.stompdemo.model.MyMsg;
import com.xzh.stompdemo.service.MsgService;
import lombok.extern.slf4j.Slf4j;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: siu
 * @Date: 2019/5/21 21:52
 */
@Controller
@Slf4j
public class TestController {

    @Autowired
    private MsgService msgService;

    @GetMapping("test")
    @ResponseBody
    public String test() {
        System.out.println("TestController.test");
        MyMsg myMsg = new MyMsg(Sid.nextShort(), System.currentTimeMillis() + "");
        msgService.test("/topic/sub1", myMsg);

        return "ok";
    }
}
