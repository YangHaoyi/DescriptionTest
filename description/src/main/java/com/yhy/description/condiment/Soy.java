package com.yhy.description.condiment;

import com.yhy.description.Beverage;
import com.yhy.description.CondimentDecorator;

import java.math.BigDecimal;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :豆浆
 */

public class Soy extends CondimentDecorator{

    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
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
                cost = add(cost,2.0D);
                break;
            case Beverage.MIDDLE:
                cost += 1.5;
                break;
            case Beverage.SMALL:
                cost += 1.0;
            default:
                //no use
                break;
        }
        return cost;
    }
    public static double add(double a1, double b1) {
       BigDecimal a2 = new BigDecimal(Double.toString(a1));
       BigDecimal b2 = new BigDecimal(Double.toString(b1));
       return a2.add(b2).doubleValue();
    }
}
