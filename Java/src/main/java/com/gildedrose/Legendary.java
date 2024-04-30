package com.gildedrose;

public class Legendary extends Categories {
  public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  public Legendary(Item item) {
    super(item);
  }

  @Override
  void updateExpiration() {}

  @Override
  void updateQuality() {}

  @Override
  void handleExpired() {}
}
