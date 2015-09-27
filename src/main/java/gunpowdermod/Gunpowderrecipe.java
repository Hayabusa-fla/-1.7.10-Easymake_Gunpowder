package gunpowdermod;


	import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
	
	 
	@Mod(modid = "Easymake_gunpowdermod")
	public class Gunpowderrecipe{
	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event){
	    }
	 
	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event){
	    }
	    {
	    	GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder,1),
			                                new ItemStack(Blocks.dirt,1),
	    	
	    	                                new ItemStack(Blocks.dirt,1),
	    	                                new ItemStack(Blocks.dirt,1),
	    	                                new ItemStack(Blocks.dirt,1)
	    	    	);
	
	    	        
	    	
	    	;	
	    	    	
	    			                         
	    			
	    			
	    	
	    	
	    	
	    	;
		       
		;
	    }
	}
	
