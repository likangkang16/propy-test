package com.lkk.demo.intermediary;

import com.lkk.demo.estate.Estate;
import com.lkk.demo.houes.HouseList;
import com.lkk.demo.myname.MyName;

/**
 * @ClassName Intermediary 中介的情况，中介必须有你自己属性，因为中介将要代替你去买房子，所有也要哟买房子的过程
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/23/9:51
 * @Version 1.0
 **/
public class Intermediary implements HouseList {

  private MyName myName;

  public Intermediary(){};

  public Intermediary(Estate estate){
      this.myName=new MyName(estate);
  }


    /**
     * 买木材
     */
    @Override
    public void getHouseMood() {
        myName.getHouseMood();
    }

    /**
     * 安装地板
     */
    @Override
    public void getHouseFloor() {
        myName.getHouseFloor();
    }
}
