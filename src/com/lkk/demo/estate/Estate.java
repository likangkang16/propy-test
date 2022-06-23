package com.lkk.demo.estate;

/**
 * @ClassName Estate 将要买的房子
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/23/9:57
 * @Version 1.0
 **/
public class Estate {
    private String name;
    private Estate(){};
    public Estate(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
