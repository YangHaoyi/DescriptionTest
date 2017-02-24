package com.yhy.description;

import com.yhy.description.condiment.Mocha;
import com.yhy.description.condiment.Soy;
import com.yhy.description.condiment.Whip;
import com.yhy.description.drink.Espresso;
import com.yhy.description.drink.HouseBlend;

public class Main {
    public static void main(String[] arges){

        Beverage beverage = new Espresso();
        System.out.println(beverage.description+" $ "+beverage.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.BIG);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()+" $ "+houseBlend.cost());

        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.BIG);
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription()+" $ "+espresso.cost());

    }
}
