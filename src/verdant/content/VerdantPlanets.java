package verdant.content;

import arc.util.*;
import arc.graphics.*;
import mindustry.content.Blocks;
import mindustry.game.Team;
import mindustry.graphics.g3d.*;
import mindustry.type.*;
import verdant.maps.planet.*;

import static mindustry.content.Planets.*;

public class VerdantPlanets {
	public static Planet
		verdania;

	public static void load(){
		Log.info("Loading VH Planets.");

		verdania = new Planet("verdania", sun, 1f, 1){{
			generator = new VerdantPlanetGenerator();
			meshLoader = () -> new HexMesh(this, 8);
			cloudMeshLoader = () -> new HexSkyMesh(
				this, 11, 1.6f, 0.11f, 5,
				Color.white.a(75), 2, 0.55f, 1f, 0.39f
			);
			atmosphereColor = Color.lime;
			bloom = true;

			alwaysUnlocked = true;
			allowLaunchToNumbered = false;

			ruleSetter = r -> {
				r.waveTeam = Team.green;
				r.fog = true;
				r.staticFog = true;
			};

			iconColor = Color.green;

			defaultCore = Blocks.coreShard;
			unlockedOnLand.add(Blocks.coreShard);
		}};
	}
}
