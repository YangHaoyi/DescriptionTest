package com.yhy.description.condiment;

import com.yhy.description.Beverage;
import com.yhy.description.CondimentDecorator;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :奶泡
 */

public class Whip extends CondimentDecorator{

    protected Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
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
                cost += 1.5;
                break;
            case Beverage.MIDDLE:
                cost += 1.0;
                break;
            case Beverage.SMALL:
                cost += 0.5;
            default:
                //no use
                break;
        }
        return cost;
    }
}
