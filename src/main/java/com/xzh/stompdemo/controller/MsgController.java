package com.xzh.stompdemo.controller;

import com.xzh.stompdemo.model.MyMsg;
import lombok.extern.slf4j.Slf4j;
import org.n3r.idworker.Sid;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: siu
 * @Date: 2019/5/21 21:37
 */
@Controller
@Slf4j
public class MsgController {


//    @MessageMapping("sub1")
//    @SendTo("/topic/sub1")
//    public String sub1() {
//        log.info("MsgController.sub1");
//        return "MsgController.sub1";
//    }

    @SubscribeMapping("/topic/sub1")
    @ResponseBody
    public MyMsg resp() {

        MyMsg myMsg = new MyMsg();
        myMsg.setId(Sid.nextShort());
        myMsg.setBody(System.currentTimeMillis() + "");

        log.info("MsgController.resp");
        return myMsg;
    }
}
