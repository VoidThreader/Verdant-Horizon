package verdant;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import verdant.content.*;

public class VerdantHorizonMod extends Mod{
    public VerdantHorizonMod(){
        Log.info("Loading Verdant Horizon...");
    }

    @Override
    public void loadContent(){
        VerdantBlocks.load();
        Log.info("Loaded Verdant Horizon.");
    }

}
