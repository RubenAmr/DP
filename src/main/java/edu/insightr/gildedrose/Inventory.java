package edu.insightr.gildedrose;

public class Inventory {

    private Item[] items;

    public Item[] getItems() {
        return items;
    }

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }
    public int UpdateQualityConjured(Item a)
    {
        int result;
        if(a.getSellIn()>0){
            a.setQuality(a.getQuality()-2);
            result=a.getQuality();
        }
        else {
            a.setQuality(a.getQuality() - 4);
            result = a.getQuality();
        }
        if(result<=0)
            result=0;

        return result;


    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            if ( "Conjured Mana Cake".equals(items[i].getName() )) {
                items[i].setQuality(UpdateQualityConjured(items[i]));
            } else {


                if (!"Aged Brie".equals(items[i].getName())
                        &&  !"Backstage passes to a TAFKAL80ETC concert".equals(items[i].getName())) {
                    if (items[i].getQuality() > 0) {
                        if ( !"Sulfuras, Hand of Ragnaros".equals(items[i].getName())) {
                            items[i].setQuality(items[i].getQuality() - 1);
                        }
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);

                        if ("Backstage passes to a TAFKAL80ETC concert".equals(items[i].getName())) {
                            if (items[i].getSellIn() < 11) {
                                if (items[i].getQuality() < 50) {
                                    items[i].setQuality(items[i].getQuality() + 1);
                                }
                            }

                            if (items[i].getSellIn() < 6) {
                                if (items[i].getQuality() < 50) {
                                    items[i].setQuality(items[i].getQuality() + 1);
                                }
                            }
                        }
                    }
                }

                if ( !"Sulfuras, Hand of Ragnaros".equals(items[i].getName())) {
                    items[i].setSellIn(items[i].getSellIn() - 1);
                }

                if (items[i].getSellIn() < 0) {
                    if ( !"Aged Brie".equals(items[i].getName())) {
                        if ( !"Backstage passes to a TAFKAL80ETC concert".equals(items[i].getName())) {
                            if (items[i].getQuality() > 0) {
                                if ( !"Sulfuras, Hand of Ragnaros".equals(items[i].getName())) {
                                    items[i].setQuality(items[i].getQuality() - 1);
                                }
                            }
                        } else {
                            items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                        }
                    } else {
                        if (items[i].getQuality() < 50) {
                            items[i].setQuality(items[i].getQuality() + 1);
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 10; i++) {
            inventory.updateQuality();
            inventory.printInventory();
        }
    }
}
