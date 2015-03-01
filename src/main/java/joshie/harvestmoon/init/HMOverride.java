package joshie.harvestmoon.init;

import static joshie.harvestmoon.core.lib.HMModInfo.MODNAME;
import static joshie.harvestmoon.init.HMConfiguration.vanilla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import joshie.harvestmoon.asm.transformers.EggTransformer;
import joshie.harvestmoon.asm.transformers.FarmlandHardnessTransformer;
import joshie.harvestmoon.asm.transformers.FarmlandTransformer;
import joshie.harvestmoon.asm.transformers.ITransformer;
import joshie.harvestmoon.asm.transformers.SeedFoodTransformer;
import joshie.harvestmoon.asm.transformers.SnowTransformer;
import joshie.harvestmoon.asm.transformers.WheatTransformer;
import joshie.harvestmoon.core.HMTab;
import joshie.harvestmoon.crops.CropData;
import joshie.harvestmoon.crops.WorldLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.launchwrapper.IClassTransformer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HMOverride implements IClassTransformer {
    private static final int EGG = 0;
    private static final int SNOW = 1;
    private static final int FARMLAND = 2;

    private static HashMap<WorldLocation, CropData> locationMap = new HashMap();
    private static HashMap<String, CropData> stringMap = new HashMap();
    private static HashMap<String, CropData> builderMap = new HashMap();
    private static HashMap<Integer, CropData> integerMap = new HashMap();

    public static final Logger logger = LogManager.getLogger("ttt");
    
    public static boolean isObfuscated = false;
    private static List<ITransformer> transformers = new ArrayList();
    static {
        transformers.add(new EggTransformer());
        transformers.add(new SeedFoodTransformer());
        transformers.add(new WheatTransformer());
        transformers.add(new FarmlandTransformer());
        transformers.add(new FarmlandHardnessTransformer());
        transformers.add(new SnowTransformer());
        //TODO: Future Plugins
        //transformers.add(new PamTransformer());

        GsonBuilder builder = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping();
        Gson gson = builder.create();

        HMConfiguration.initASM(gson);
        for (int i = 0; i < transformers.size(); i++) {
            if (!transformers.get(i).isActive(HMConfiguration.vanilla)) {
                transformers.remove(i);
            }
        }
    }

    public static void init() {
        if (HMConfiguration.vanilla.HOES_HIDDEN) {
            Items.wooden_hoe.setCreativeTab(null);
            Items.stone_hoe.setCreativeTab(null);
            Items.iron_hoe.setCreativeTab(null);
            Items.diamond_hoe.setCreativeTab(null);
            Items.golden_hoe.setCreativeTab(null);
        }

        if (vanilla.CARROT_BLOCK_DISABLE_TICKING) Blocks.carrots.setTickRandomly(false);
        if (vanilla.POTATO_BLOCK_DISABLE_TICKING) Blocks.potatoes.setTickRandomly(false);
        if (vanilla.WHEAT_BLOCK_DISABLE_TICKING) Blocks.wheat.setTickRandomly(false);
        if (vanilla.MOVE_OVERRIDE_TAB) {
            if (vanilla.CARROT_OVERRIDE) Items.carrot.setCreativeTab(HMTab.tabGeneral);
            if (vanilla.POTATO_OVERRIDE) Items.potato.setCreativeTab(HMTab.tabGeneral);
            if (vanilla.WHEAT_OVERRIDE) Items.wheat.setCreativeTab(HMTab.tabGeneral);
            if (vanilla.EGG_OVERRIDE) Items.egg.setCreativeTab(HMTab.tabGeneral);
            if (vanilla.FARMLAND_OVERRIDE) Blocks.farmland.setTickRandomly(false);
        }
    }

    @Override
    public byte[] transform(String name, String transformedName, byte[] data) {
        byte[] modified = data;
        for (ITransformer t : transformers) {
            if (name.equals(t.getClass(isObfuscated))) {
                modified = t.transform(modified, isObfuscated);
            }
        }

        return modified;
    }
}