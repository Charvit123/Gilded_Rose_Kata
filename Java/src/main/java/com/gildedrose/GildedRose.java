package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateItems() {
    for (Item item : items) {
      InventoryAction.create(item).dailyUpdate();
    }
  }

}