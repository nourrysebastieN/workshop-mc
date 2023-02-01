package item;

import re.seb.workshop.workshop;

import java.util.ArrayList;

public class workshopItem {
    public ArrayList <Item> arrayList;
    public static void setItemName(Item item, String name) {
        item.setRegistryName(workshop.MODID,
                name).setUnlocalizedName(workshop.MODID + "." + name);
        ITEMS.add(item);
    }
    public static vois setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }
}
