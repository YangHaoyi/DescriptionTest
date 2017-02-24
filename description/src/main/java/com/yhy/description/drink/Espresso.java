package com.yhy.description.drink;

import com.yhy.description.Beverage;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :浓缩咖啡
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
