//package gtis.common.item.gregtools;
//
//
//import gregtech.api.GTValues;
//import gregtech.api.items.toolitem.IGTTool;
//import gregtech.api.items.toolitem.ItemGTTool;
//import gregtech.api.items.toolitem.ToolClasses;
//import gtis.GTISCore;
//
//import static gregtech.common.items.ToolItems.register;
//
///**
// * @author Orirock
// */
//public class ModTools {
//        public static IGTTool VAJRA ;
//
//        public static void init(){
//            VAJRA = register(ItemGTTool.Builder.of(GTISCore.MODID,"vajra")
//                    .toolStats(g -> g.blockBreaking().attackDamage(10.0F).attackSpeed(5.6F).baseEfficiency(10.0F).noEnchant())
//                    .electric(GTValues.IV)
//                    .toolClasses(ToolClasses.WRENCH,ToolClasses.WIRE_CUTTER,ToolClasses.PICKAXE, ToolClasses.AXE,ToolClasses.SWORD,ToolClasses.SHOVEL,ToolClasses.HOE)
//            );
//
//        }
//}
