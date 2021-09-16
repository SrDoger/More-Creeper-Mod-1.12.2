package com.srdoger.morecreeper.objects.items;

import com.srdoger.morecreeper.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);

    }
}
