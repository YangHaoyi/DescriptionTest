package com.yhy.description.condiment;

import com.yhy.description.Beverage;
import com.yhy.description.CondimentDecorator;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class Mocha extends CondimentDecorator{

    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (getSize()){
            case Beverage.BIG:
                cost += 3.0;
                break;
            case Beverage.MIDDLE:
                cost += 2.0;
                break;
            case Beverage.SMALL:
                cost += 1.0;
            default:
                //no use
                break;
        }
        return cost;
    }
}
