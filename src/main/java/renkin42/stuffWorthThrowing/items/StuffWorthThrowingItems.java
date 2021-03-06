package renkin42.stuffWorthThrowing.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class StuffWorthThrowingItems {

	public static Item sandPile;
	public static Item soulSandPile;
	public static Item rock;
	public static Item snowballRock;
	public static Item ectoplasm;
	public static Item spectralBrick;
	public static Item brokenBrick;
	public static Item brokenNetherBrick;
	public static Item brokenSpectralBrick;
	public static Item dynamite;
	public static Item dynamiteSnowball;
	public static Item fungusSpore;
	public static Item corruptedEctoplasm;
	public static Item corruptedSpectralBrick;
	public static Item brokenCSBrick;
	public static Item purifiedSoul;
	public static Item swiftDust;
	public static Item shineDust;
	public static Item loveLetter;
	public static Item hateMail;
	
	public StuffWorthThrowingItems() {
		
		sandPile = new ItemSandPile("sandPile");
    	soulSandPile = new ItemSoulSandPile("soulSandPile");
    	rock = new ItemRock("rock");
    	snowballRock = new ItemSnowballRock("snowballRock");
    	ectoplasm = new ItemNormal("ectoplasm");
    	spectralBrick = new ItemNormal("spectralBrick");
    	brokenBrick = new ItemBrokenBrick("brokenBrick");
    	brokenNetherBrick = new ItemBrokenNetherBrick("brokenNetherBrick");
    	brokenSpectralBrick = new ItemBrokenSpectralBrick("brokenSpectralBrick");
    	dynamite = new ItemDynamite("dynamite");
    	dynamiteSnowball = new ItemDynamiteSnowball("dynamiteSnowball");
    	fungusSpore = new ItemFungusSpore("fungusSpore");
    	corruptedEctoplasm = new ItemNormal("corruptedEctoplasm");
    	corruptedSpectralBrick = new ItemNormal("corruptedSpectralBrick");
    	brokenCSBrick = new ItemBrokenCSBrick("brokenCSBrick");
    	purifiedSoul = new ItemPurifiedSoul("purifiedSoul");
    	swiftDust = new ItemSwiftDust("swiftDust");
    	shineDust = new ItemShineDust("shineDust");
    	loveLetter = new ItemLoveLetter("loveLetter");
    	hateMail = new ItemHateMail("hateMail");
    	
    	GameRegistry.registerItem(sandPile, "sand_pile");
    	GameRegistry.registerItem(soulSandPile, "soul_sand_pile");
    	GameRegistry.registerItem(rock, "rock");
    	GameRegistry.registerItem(snowballRock, "snowball_rock");
    	GameRegistry.registerItem(ectoplasm, "ectoplasm");
    	GameRegistry.registerItem(spectralBrick, "spectral_brick");
    	GameRegistry.registerItem(brokenBrick, "broken_brick");
    	GameRegistry.registerItem(brokenNetherBrick, "broken_nether_brick");
    	GameRegistry.registerItem(brokenSpectralBrick, "broken_spectral_brick");
    	GameRegistry.registerItem(dynamite, "dynamite");
    	GameRegistry.registerItem(dynamiteSnowball, "dynamite_snowball");
    	GameRegistry.registerItem(fungusSpore, "fungus_spore");
    	GameRegistry.registerItem(corruptedEctoplasm, "corrupted_ectoplasm");
    	GameRegistry.registerItem(corruptedSpectralBrick, "cs_brick");
    	GameRegistry.registerItem(brokenCSBrick, "broken_cs_brick");
    	GameRegistry.registerItem(purifiedSoul, "purified_soul_sand");
    	GameRegistry.registerItem(swiftDust, "swift_dust");
    	GameRegistry.registerItem(shineDust, "shine_dust");
    	GameRegistry.registerItem(loveLetter, "love_letter");
    	GameRegistry.registerItem(hateMail, "hate_mail");
    	
	}

}
