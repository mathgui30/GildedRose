package com.gildedrose;

public class ConjuredItem extends Item{

    public ConjuredItem(String name, double price, int sellIn, int quality, float discount) {
        super(name, price, sellIn, quality, discount);
    }

    @Override
    public void updateQuality(Item items) {
        items.sellIn--;

        if (items.quality < 50) {
            items.quality = items.quality - 2;
            if (items.sellIn < 0) {
                items.quality = items.quality - 4;
            }
        }
        if(items.sellIn < 0) {
            items.quality = 0;
        }
    }
}
