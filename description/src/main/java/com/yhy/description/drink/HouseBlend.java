package com.yhy.description.drink;

import com.yhy.description.Beverage;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
