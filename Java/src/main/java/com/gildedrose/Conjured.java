package com.gildedrose;

public class Conjured extends Categories {
  public static final String CONJURED = "Conjured";

  public Conjured(Item item) {
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
