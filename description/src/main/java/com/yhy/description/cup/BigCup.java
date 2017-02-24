package com.yhy.description.cup;

import com.yhy.description.Beverage;
import com.yhy.description.CupSize;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class BigCup extends CupSize{

    protected Beverage beverage;

    public BigCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", BigCup";
    }

    @Override
    public double cost() {
        return 1.5+beverage.cost();
    }
}
