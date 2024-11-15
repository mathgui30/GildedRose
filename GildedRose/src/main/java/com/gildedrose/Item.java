package com.gildedrose;

public abstract class Item {

    public String name;

    protected double price;

    protected int sellIn;

    protected int quality;

    protected float discount;

    protected boolean discountApplied;

    public Item(String name,double price, int sellIn, int quality, float discount) {
        this.name = name;
        this.price = price;
        this.sellIn = sellIn;
        this.quality = quality;
        this.discount = discount;
        this.discountApplied = false;
    }


   @Override
   public String toString() {
        return this.name + ", " + this.price + ", " + this.sellIn + ", " + this.quality + ", " + this.discount;
    }

    public abstract void updateQuality(Item items);
}
