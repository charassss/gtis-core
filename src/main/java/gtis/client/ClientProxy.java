package gtis.client;

import gtis.common.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

/**
 * @author Chara_SS
 */
@SuppressWarnings("unused")
public class ClientProxy extends CommonProxy {

        @Override
        public boolean isServer() {
            return super.isServer();
        }

        @Override
        public void registerItemRenderer(Item item, int meta, String id) {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), id));
        }
}
