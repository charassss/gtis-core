package gtis.common;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chara_SS
 */
@SuppressWarnings("unused")
public class CommonMixin implements ILateMixinLoader {
    @Override
    public List<String> getMixinConfigs() {
        return new ArrayList<String>() {{
            add("mixins.gtiscore.json");
        }};
    }
}
