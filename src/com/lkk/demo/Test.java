package com.lkk.demo;

import com.lkk.demo.estate.Estate;
import com.lkk.demo.intermediary.Intermediary;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/23/10:03
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //实现一个房子
        Estate estate =new Estate("呵呵****");
        //找个中介哈
        Intermediary intermediary =new Intermediary(estate);
        //买房子过程
        intermediary.getHouseFloor();
        intermediary.getHouseMood();
    }
}
