package com.yhy.description;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :饮料
 */

public abstract class Beverage {
    protected String description = "Unknow Beverage";
    private int size;
    public static final int BIG = 1;
    public static final int MIDDLE = 2;
    public static final int SMALL = 4;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();

}
