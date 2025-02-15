package com.ticticboooom.mods.mm.inventory.astral;

import hellfirepvp.astralsorcery.common.starlight.IStarlightReceiver;
import hellfirepvp.astralsorcery.common.starlight.IStarlightTransmission;
import hellfirepvp.astralsorcery.common.starlight.transmission.ITransmissionReceiver;
import hellfirepvp.astralsorcery.common.starlight.transmission.base.SimplePrismTransmissionNode;
import hellfirepvp.astralsorcery.common.starlight.transmission.base.SimpleTransmissionReceiver;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class MMStarlightReceiver implements IStarlightReceiver<ITransmissionReceiver> {

    private final World world;
    private final BlockPos pos;

    public MMStarlightReceiver(World world, BlockPos pos) {
        this.world = world;
        this.pos = pos;
    }

    @Nonnull
    @Override
    public BlockPos getTrPos() {
        return pos;
    }

    @Nonnull
    @Override
    public World getTrWorld() {
        return world;
    }

    @Nonnull
    @Override
    public ITransmissionReceiver provideEndpoint(BlockPos blockPos) {
        return null;
    }
}
