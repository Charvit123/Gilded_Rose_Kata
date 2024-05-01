package com.gildedrose;

public class ItemCategories extends InventoryActions {

  public ItemCategories(Item item) {
    super(item);
  }

  public static ItemCategories create(Item item) {
    switch (item.name) {
      case AgedBrieItems.AGED_BRIE:
        return new AgedBrieItems(item);
      case BackstagePassesItems.BACKSTAGE_PASSES:
        return new BackstagePassesItems(item);
      case LegendaryItems.SULFURAS:
        return new LegendaryItems(item);
      case ConjuredItems.CONJURED:
        return new ConjuredItems(item);
      default:
        return new DefaultItems(item);
    }
  }
}
