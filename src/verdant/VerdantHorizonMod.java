package verdant;

import arc.util.*;
import mindustry.mod.*;
import verdant.content.*;

public class VerdantHorizonMod extends Mod{
    public VerdantHorizonMod(){
        Log.info("Loading Verdant Horizon...");
    }

    @Override
    public void loadContent(){
        VerdantBlocks.load();
        VerdantPlanets.load();
        Log.info("Loaded Verdant Horizon.");
    }

}
