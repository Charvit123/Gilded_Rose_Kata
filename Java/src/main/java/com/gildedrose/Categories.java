package com.gildedrose;

public class Categories extends InventoryActions {

  public Categories(Item item) {
    super(item);
  }

  public static Categories create(Item item) {
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
        return new DefaultItems(item);
    }
  }
}
