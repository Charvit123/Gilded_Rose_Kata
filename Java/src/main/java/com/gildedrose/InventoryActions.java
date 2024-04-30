package com.gildedrose;

abstract class InventoryActions {
  protected final Item item;

  protected InventoryActions(Item item) {
    this.item = item;
  }

  void dailyUpdate() {
    updateQuality();
    updateExpiration();
    handleIfExpired();
  }

  void decreaseQuality() {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
  }

  void increaseQuality() {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
  }

  void updateQuality() {
    decreaseQuality();
  }

  void handleIfExpired() {
    if (item.sellIn < 0) {
      handleExpired();
    }
  }

  void handleExpired() {
    decreaseQuality();
  }

  void updateExpiration() {
    item.sellIn = item.sellIn - 1;
  }
}
