package com.gildedrose;

public class LegendaryItems extends ItemCategories {
  public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  public LegendaryItems(Item item) {
    super(item);
  }

  @Override
  void updateExpiration() {}

  @Override
  void updateQuality() {}

  @Override
  void handleExpired() {}
}
