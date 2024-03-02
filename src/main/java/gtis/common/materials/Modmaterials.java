package gtis.common.materials;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialFlags.GENERATE_GEAR;
import static gtis.common.GTISUtility.gtisId;

/**
 * @author Orirock
 */
public class Modmaterials {
    private static Material materialMana ;

    public static void init() {
        materialMana = new Material.Builder(32766, gtisId("materials_mana"))
                .ingot()
                .color(0x3389FF)
                //CEu uses the hex color code, but make sure to put 0x before the hex color
                .iconSet(MaterialIconSet.METALLIC)
                //gregtech/api/unification/material/info/MaterialIconSet.java
                .flags(GENERATE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                //Flags, you can find all of them at gregtech/api/unification/material/info/MaterialFlags.java
                .components(Iron, 1, Oxygen, 20)
                //You can find all materials on gregtech/api/unification/material/Materials.java
                .itemPipeProperties(8192, 1)
                //Priority, transferRate
                .cableProperties(VA[UV], 128, 0, true, 78)
                //Voltage, Amps, EnergyLoss, isSuperConductor, CriticalTemp
//                .blastTemp(9001, BlastProperty.GasTier.HIGHER, VA[ZPM], 1000)
                /*
                    ↑你先别用这个方法，这方法马上要被移除了，尽量找到其他实现方法，实在不行你push上去我来改
                 */
                .blast(9001, BlastProperty.GasTier.HIGHER)
                //Temp, GasTier, eutOverride, durationOveride (in ticks)

                .build();
    }
}
