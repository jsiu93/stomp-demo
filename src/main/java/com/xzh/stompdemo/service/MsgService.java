package com.xzh.stompdemo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: siu
 * @Date: 2019/5/21 21:29
 */
@Service
@Slf4j
public class MsgService {

    private SimpMessagingTemplate simpMessagingTemplate;


    public MsgService(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    public void test(String dest, Object payload) {
        simpMessagingTemplate.convertAndSend(dest, payload);

    }



}
