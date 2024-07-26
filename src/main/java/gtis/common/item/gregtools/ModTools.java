//package gtis.common.item.gregtools;
//
//import gtis.GTISCore;
//import gregtech.api.GTValues;
//import gregtech.api.items.toolitem.*;
//
//import static gregtech.common.items.ToolItems.register;
//
///**
// * @author Orirock
// */
//public class ModTools {
//        public static IGTTool VAJRA ;
//        public static void init(){
//            VAJRA = register(ItemGTTool.Builder.of(GTISCore.MODID,"vajra")
//                    .toolStats(g -> g.blockBreaking().attackDamage(10.0F).attackSpeed(5.6F).baseEfficiency(10.0F))
//                    .toolClasses(ToolClasses.WRENCH,ToolClasses.WIRE_CUTTER,ToolClasses.PICKAXE, ToolClasses.AXE,ToolClasses.SWORD,ToolClasses.SHOVEL,ToolClasses.HOE)
//                    .electric(GTValues.IV)
//            );
//        }
//}
