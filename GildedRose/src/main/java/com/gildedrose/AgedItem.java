package com.gildedrose;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AgedItem extends Item implements Calc{

    public AgedItem(String name, double price, int sellIn, int quality, float discount) {
        super(name, price,  sellIn, quality, discount);
    }

    @Override
    public void updateQuality(Item items) {
        items.sellIn--;

        if (items.quality < 50) {
            items.quality = items.quality + 1;

            if (items.sellIn <= 10) {
                items.quality = items.quality + 1;
            } else if (items.sellIn <= 5) {
                items.quality = items.quality + 2;
            } if (items.sellIn < 0) {
                items.quality = 0;
            }
        }
    }

    @Override
    public void calcDiscount(Item items) {
        if(items.quality <= 0 && !items.discountApplied) {
            double newPrice = items.price * (1 - items.discount);
            BigDecimal bd = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);
            items.price = bd.doubleValue();
            items.discountApplied = true;
        }
    }
}
