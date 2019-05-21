package com.xzh.stompdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @Auther: siu
 * @Date: 2019/5/21 21:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyMsg {

    private String id;

    private String body;

}
