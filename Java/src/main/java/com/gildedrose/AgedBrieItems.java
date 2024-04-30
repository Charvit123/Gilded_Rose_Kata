package com.gildedrose;

public class AgedBrieItems extends InventoryAction {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItems(Item item) {
      super(item);
  }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void handleExpired() {
        increaseQuality();
    }
}
