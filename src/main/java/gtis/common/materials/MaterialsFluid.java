package gtis.common.materials;


import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;

import static gtis.common.GTISUtility.gtisId;

/**
 * @author Orirock
 */
//@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class MaterialsFluid {
    public static Material fluidMana ;
    private static int START_ID = 11001;
    //fluidID: 11001~12001
    private static final int END_ID = START_ID + 1000;
    public static void init(){
        fluidMana = new Material.Builder(getFluidId(),gtisId("fluidMana"))
                .fluid()
                .color(0x00CCFF)
                .iconSet(MaterialIconSet.FLUID)
                .element(MaterialsElement.elementMana)
                .build();
    }
    private static int getFluidId() {
        if (START_ID < END_ID) {
            return START_ID++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
