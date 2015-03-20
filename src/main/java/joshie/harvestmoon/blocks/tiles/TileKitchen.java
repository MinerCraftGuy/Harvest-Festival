package joshie.harvestmoon.blocks.tiles;

import joshie.harvestmoon.api.cooking.IUtensil;
import joshie.harvestmoon.cooking.Utensil;

public class TileKitchen extends TileCooking {
    @Override
    public boolean canUpdate() {
        return false;
    }

    @Override
    public IUtensil getUtensil() {
        return Utensil.KITCHEN;
    }
}
