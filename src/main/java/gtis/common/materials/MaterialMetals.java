package gtis.common.materials;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gtis.common.GTISUtility.gtisId;
import static gtis.common.materials.MaterialFluids.*;


/**
 * @author Orirock
 */
public class MaterialMetals {
    public static Material manaSteel;
    public static Material elvenElementium;
    public static Material terraSteel;
    private static int START_ID = 10001;
    //metalID: 10001~11001
    private static final int END_ID = START_ID + 1000;

    public static void init() {
        manaSteel = new Material.Builder(getMetalId(), gtisId("manaSteel"))
                .ingot()
                .color(0x00B4FF)
                //CEu uses the hex color code, but make sure to put 0x before the hex color
                .iconSet(MaterialIconSet.METALLIC)
                //gregtech/api/unification/material/info/MaterialIconSet.java
                .flags(GENERATE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                //Flags, you can find all of them at gregtech/api/unification/material/info/MaterialFlags.java
                .components(Iron, 1, mana, 6)
                //You can find all materials on gregtech/api/unification/material/Materials.java
                .cableProperties(32, 1, 0, true, 78)
                //Voltage, Amps, EnergyLoss, isSuperConductor, CriticalTemp
                .blast(900, BlastProperty.GasTier.HIGHER)
                //Temp, GasTier, eutOverride, durationOveride (in ticks)
                .build();

        elvenElementium = new Material.Builder(getMetalId(), gtisId("elvenElementium"))
                .ingot()
                .color(0xF152DB)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(GENERATE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .cableProperties(512, 1, 0, true, 78)
                .blast(2000, BlastProperty.GasTier.HIGHER)
                .build();

        terraSteel = new Material.Builder(getMetalId(), gtisId("terraSteel"))
                .ingot()
                .color(0x57FF09)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(GENERATE_PLATE, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .cableProperties(8192, 1, 0, true, 78)
                .blast(3000, BlastProperty.GasTier.HIGHER)
                .build();
    }

    private static int getMetalId() {
        if (START_ID < END_ID) {
            return START_ID++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

}
