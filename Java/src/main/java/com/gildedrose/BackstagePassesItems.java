package com.gildedrose;

public class BackstagePassesItems extends ItemCategories {
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePassesItems(Item item) {
    super(item);
  }

  @Override
  protected void updateQuality() {
    increaseQuality();
    if (item.sellIn < 11) {
      increaseQuality();
    }
    if (item.sellIn < 6) {
      increaseQuality();
    }
  }

  @Override
  void handleExpired() {
    item.quality = 0;
  }
}
