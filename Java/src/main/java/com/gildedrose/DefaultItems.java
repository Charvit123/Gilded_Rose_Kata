package com.gildedrose;

public class DefaultItems extends Categories {
  public DefaultItems(Item item) {
    super(item);
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
