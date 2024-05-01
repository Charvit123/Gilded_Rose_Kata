package com.gildedrose;

public class ConjuredItems extends ItemCategories {
  public static final String CONJURED = "Conjured";

  public ConjuredItems(Item item) {
    super(item);
  }

  @Override
  void decreaseQuality() {
    item.quality = Math.max(0, item.quality - 2);
  }

  @Override
  void updateQuality() {
    decreaseQuality();
  }

  @Override
  void handleExpired() {
    decreaseQuality();
  }
}
