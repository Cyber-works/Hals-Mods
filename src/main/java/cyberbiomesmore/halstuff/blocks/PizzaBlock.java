package cyberbiomesmore.halstuff.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PizzaBlock extends CakeBlock {

    protected static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(3.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(5.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(7.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(9.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(11.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D),
            Block.createCuboidShape(13.0D, 0.0D, 1.0D, 15.0D, 4.0D, 15.0D)
    };

    public PizzaBlock() {
        super(FabricBlockSettings.of(Material.CAKE).breakByHand(true).hardness(0.5f).sounds(BlockSoundGroup.SHROOMLIGHT));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPES[state.get(BITES)];
    }
}
