package com.gildedrose;

public class AgedBrieItems extends ItemCategories {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItems(Item item) {
      super(item);
  }

    @Override
    void updateQuality() {
        increaseQuality();
    }

    @Override
    void handleExpired() {
        increaseQuality();
    }


}
