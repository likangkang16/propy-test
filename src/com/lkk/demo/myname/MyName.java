package com.lkk.demo.myname;

import com.lkk.demo.estate.Estate;
import com.lkk.demo.houes.HouseList;

/**
 * @ClassName MyName 自己将要买房子，必须你自己要有个房子属性 以及要买房子的过程
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/23/9:53
 * @Version 1.0
 **/
public class MyName implements HouseList {

    private Estate estate;

    public MyName(){};
    public MyName(Estate estate){
        this.estate=estate;
    }


    /**
     * 买木材
     */
    @Override
    public void getHouseMood() {
        System.out.println(estate.getName()+"买个木材");
    }

    /**
     * 安装地板
     */
    @Override
    public void getHouseFloor() {
        System.out.println(estate.getName()+"买个地板");
    }
}
