package cyberbiomesmore.halstuff;

import cyberbiomesmore.halstuff.blocks.PizzaBlock;
import jdk.nashorn.internal.ir.Block;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Halstuff implements ModInitializer {

    // ITEM Initialization
    public static final Item CHEESE_PIZZA = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));

    // BLOCK Initialization

    public static final PizzaBlock PIZZA_CHEESE = new PizzaBlock();

    //public static final net.minecraft.block.Block CAKE = register("cake", new CakeBlock(net.minecraft.block.Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));

    @Override
    public void onInitialize() {



        // Registering new BLOCKS
        Registry.register(Registry.BLOCK, new Identifier("halstuff", "pizza_cheese"), PIZZA_CHEESE);

        // Registering new ITEMS
        Registry.register(Registry.ITEM, new Identifier("halstuff", "cheese_pizza"),
                new BlockItem(PIZZA_CHEESE, new FabricItemSettings().group(ItemGroup.MISC)));



    }
}
