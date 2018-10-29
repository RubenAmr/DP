package edu.insightr.gildedrose;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {

    public void testQualityDexterityVest(){
        Item Dexterity_Vest=new Item("+5 Dexterity Vest", 10, 20);
        Item[]Items=new Item[]{Dexterity_Vest};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(19,newInventory.getItems()[0].getQuality());
    }

    public void testQualityDexterityVestNegSellIn(){
        Item Dexterity_Vest=new Item("+5 Dexterity Vest", -2, 20);
        Item[]Items=new Item[]{Dexterity_Vest};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(18,newInventory.getItems()[0].getQuality());
    }

    public void testQualityDexterityVestSup0(){
        Item Dexterity_Vest=new Item("+5 Dexterity Vest", -2, 1);
        Item[]Items=new Item[]{Dexterity_Vest};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    public void testQualityAgedBrie(){
        Item Aged_Brie=new Item("Aged Brie", 1, 1);
        Item[]Items=new Item[]{Aged_Brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(2,newInventory.getItems()[0].getQuality());
    }

    public void testQualityAgedBrieNegSellIn(){
        Item Aged_Brie=new Item("Aged Brie", -2, 4);
        Item[]Items=new Item[]{Aged_Brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(6,newInventory.getItems()[0].getQuality());
    }

    public void testQualityAgedBrieInf50(){
        Item Aged_Brie=new Item("Aged Brie", -25, 49);
        Item[]Items=new Item[]{Aged_Brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(50,newInventory.getItems()[0].getQuality());
    }

    public void testQualityElixir(){
        Item Elixir=new Item("Elixir of the Mongoose", 4, 6);
        Item[]Items=new Item[]{Elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(5,newInventory.getItems()[0].getQuality());
    }

    public void testQualityElixirNegSellIn(){
        Item Elixir=new Item("Elixir of the Mongoose", 0, 2);
        Item[]Items=new Item[]{Elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    public void testQualityElixirSup0(){
        Item Elixir=new Item("Elixir of the Mongoose", -1, 0);
        Item[]Items=new Item[]{Elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    public void testQualityBackstage10Days(){
        Item Backstage=new Item("Backstage passes to a TAFKAL80ETC concert", 10, 6);
        Item[]Items=new Item[]{Backstage};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(8,newInventory.getItems()[0].getQuality());
    }

    public void testQualityBackstage5Days(){
        Item Backstage=new Item("Backstage passes to a TAFKAL80ETC concert", 5, 2);
        Item[]Items=new Item[]{Backstage};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(5,newInventory.getItems()[0].getQuality());
    }

    public void testQualityBackstage0(){
        Item Backstage=new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        Item[]Items=new Item[]{Backstage};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    public void testQualityConjured(){
        Item Conjured=new Item("Conjured Mana Cake", 5, 10);
        Item[]Items=new Item[]{Conjured};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(8,newInventory.getItems()[0].getQuality());
    }

    public void testQualityConjuredNeg(){
        Item Conjured=new Item("Conjured Mana Cake", 0, 10);
        Item[]Items=new Item[]{Conjured};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(6,newInventory.getItems()[0].getQuality());
    }

    public void testQualityConjured0(){
        Item Conjured=new Item("Conjured Mana Cake", 5, 0);
        Item[]Items=new Item[]{Conjured};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }
}