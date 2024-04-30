package com.gildedrose;

public class BackstagePasses extends Categories {
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePasses(Item item) {
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
