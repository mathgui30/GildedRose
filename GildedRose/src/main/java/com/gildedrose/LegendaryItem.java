package com.gildedrose;

public class LegendaryItem extends Item{

    public int rarity;

    public LegendaryItem(String name, double price, int sellIn, int quality, float discount, int rarity) {
        super(name, price, sellIn, quality, discount);
        this.rarity = rarity;
    }

    @Override
    public void updateQuality(Item items) {

        items.sellIn--;

        if(rarity >= 40 && items.sellIn <= 0) {
            items.quality = quality += 10;
        }
    }

    public String toString() {
        return this.name + ", " + this.price + ", " + this.sellIn + ", " + this.quality + ", " + this.discount + ", " + this.rarity;

    }
}
