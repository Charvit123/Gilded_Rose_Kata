package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateItems() {
    for (Item item : items) {
      ItemCategories.create(item).dailyUpdate();
    }
  }
}
