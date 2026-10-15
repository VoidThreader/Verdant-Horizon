package verdant.maps.planet;

import arc.graphics.*;
import arc.math.Mathf;
import arc.math.geom.*;
import arc.util.noise.*;
import mindustry.maps.generators.*;

public class VerdantPlanetGenerator extends PlanetGenerator {
	Color c1 = new Color(0x1fff24ff), c2 = Color.cyan;

	@Override
	public float getHeight(Vec3 position){
		return 0;
	}

	@Override
	public void getColor(Vec3 position, Color out){
		float depth =
			Simplex.noise3d(seed, 2f, 0.56f, 1.7f, position.x, position.y, position.z) / 2f;
		out.set(c1).lerp(c2, Mathf.clamp(Mathf.round(depth, 0.15f))).a(1f - 0.2f).toFloatBits();
	}
}
