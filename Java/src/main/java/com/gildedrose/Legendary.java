package com.gildedrose;

public class Legendary extends InventoryAction {
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public Legendary(Item item) {
    super(item);
  }

  @Override
  protected void updateQuality() {}

  @Override
  protected void updateExpiration() {}

  @Override
  protected void handleExpired() {}
}
