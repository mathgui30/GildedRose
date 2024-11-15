package com.gildedrose;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NormalItem extends Item implements Calc {
    Item[] items;


    public NormalItem(String name, double price, int sellIn, int quality, float discount) {
        super(name, price,  sellIn, quality, discount);
    }


    @Override
    public void updateQuality(Item items) {
        items.sellIn--;

        if (items.quality < 50) {
            if (items.sellIn > 0) {
                items.quality--;
            } else if (items.sellIn < 0) {
                items.quality = items.quality - 2;
            }
        }
        if(items.sellIn < 0) {
            items.quality = 0;
        }
    }

    @Override
    public void calcDiscount(Item items) {
        if(items.sellIn < 10 && !items.discountApplied) {
            double newPrice = items.price * (1 - items.discount);
            BigDecimal bd = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);
            items.price = bd.doubleValue();
            items.discountApplied = true;
        }
    }
}
