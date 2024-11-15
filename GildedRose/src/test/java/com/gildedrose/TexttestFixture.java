package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        NormalItem[] items = new NormalItem[] {
                new NormalItem("+5 Dexterity Vest", 100, 20, 23, 0.20f),
        };
        AgedItem[] agedItems = new AgedItem[] {
            new AgedItem("Aged brie", 50, 20, 12, 0.10f),
        };

        ConjuredItem[] conjuredItems = new ConjuredItem[] {
            new ConjuredItem("Conjured bread", 50, 20, 12, 0.10f),
        };
        LegendaryItem[] legendaryItems = new LegendaryItem[] {
            new LegendaryItem("Legendary egg", 50, 20, 12, 0.10f, 45),
        };


        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");

            System.out.println("__ Aged Items! __");
            System.out.println("name, price, sellIn, quality, discount");
            for (AgedItem agedItem : agedItems){
                agedItem.updateQuality(agedItem);
                System.out.println(agedItem);

            }

            System.out.println("__ Normal Items! __");
            System.out.println("name, price, sellIn, quality, discount");
            for (NormalItem item : items) {
                item.updateQuality(item);
                item.calcDiscount(item);

                System.out.println(item);
            }

            System.out.println("__ Conjured Items! __");
            System.out.println("name, price, sellIn, quality, discount");
            for (ConjuredItem conjuredItem : conjuredItems){
                conjuredItem.updateQuality(conjuredItem);
                System.out.println(conjuredItem);

            }
            System.out.println("__ Legendary Items! __");
            System.out.println("name, price, sellIn, quality, discount, rarity");
            for (LegendaryItem legendaryItem : legendaryItems){
                legendaryItem.updateQuality(legendaryItem);
                System.out.println(legendaryItem);

            }


            System.out.println();
        }
    }

}
