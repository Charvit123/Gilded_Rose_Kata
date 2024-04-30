package com.gildedrose;

public class InventoryAction {

  protected final Item item;

  public InventoryAction(Item item) {
    this.item = item;
  }

  public static InventoryAction create(Item item) {
    switch (item.name) {
      case AgedBrieItems.AGED_BRIE:
        return new AgedBrieItems(item);
      case BackstagePasses.BACKSTAGE_PASSES:
        return new BackstagePasses(item);
      case Legendary.SULFURAS:
        return new Legendary(item);
      case Conjured.CONJURED:
        return new Conjured(item);
      default:
        return new InventoryAction(item);
    }
  }

  protected void dailyUpdate() {
    updateQuality();
    updateExpiration();
    handleIfExpired();
  }

  protected void decreaseQuality() {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
  }

  protected void increaseQuality() {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
  }

  protected void updateExpiration() {
    item.sellIn = item.sellIn - 1;
  }

  protected void updateQuality() {
    decreaseQuality();
  }

  protected void handleIfExpired() {
    if (item.sellIn < 0) {
      handleExpired();
    }
  }

  protected void handleExpired() {
    decreaseQuality();
  }
}
