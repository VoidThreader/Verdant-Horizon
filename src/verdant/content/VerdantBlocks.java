package verdant.content;

import arc.graphics.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.turrets.*;

import static mindustry.Vars.tilesize;

public class VerdantBlocks {
	public static Block
		sling;

	public static void load(){
		Log.info("Loading VH Blocks.");

		sling = new ItemTurret("sling"){{
			requirements(Category.turret, ItemStack.with(
				Items.copper, 50
			));

			scaledHealth = 100f;
			armor = 1f;
			size = 1;

			reload = 12f;
			recoil = 1f;
			maxAmmo = 10;
			inaccuracy = 5f;
			range = 22f * tilesize;
			rotateSpeed = 6f;
			coolant = consumeCoolant(0.05f);

			shootSound = Sounds.shootBreach;

			ammo(
				Items.copper, new BasicBulletType(7.5f, 8){{
					width = 5f;
					height = 12f;

					ammoMultiplier = 1f;
					pierce = true;
					pierceCap = 2;
					pierceBuilding = false;
					lifetime = 25f;

					hitColor = backColor = trailColor = Pal.copperAmmoBack;
					frontColor = Color.white;
					trailWidth = 1.5f;
					trailLength = 7;
					hitEffect = despawnEffect = Fx.hitBulletColor;
				}}
			);
		}};
	}
}
