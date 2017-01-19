package Maps;

public class CampList {
	public CampList(){
		// Siege Giants 
		Camp siegeGiant = new Camp();
		siegeGiant.setCooldown(180);
		siegeGiant.setStart(120);
		// Sappers
		Camp sappers = new Camp();
		sappers.setCooldown(90);
		sappers.setStart(90);
		// Impalers
		Camp impalers = new Camp();
		impalers.setCooldown(120);
		impalers.setStart(120);
		// Hellbats
		Camp hellbats = new Camp();
		hellbats.setCooldown(0);
		hellbats.setStart(0);
		// Knights
		Camp knights = new Camp();
		knights.setCooldown(240);
		knights.setStart(150);
		// Fallen Shaman
		Camp fallenShaman = new Camp();
		fallenShaman.setCooldown(150);
		fallenShaman.setStart(150);
		// Goliaths & Raven
		Camp goliathRaven = new Camp();
		goliathRaven.setCooldown(0);
		goliathRaven.setStart(0);
		// Grave Golem
		Camp graveGolem = new Camp();
		graveGolem.setCooldown(180);
		graveGolem.setStart(180);
		// Jackal
		Camp jackal = new Camp();
		jackal.setCooldown(180);
		jackal.setStart(180);
		// Archangel Braxis
		Camp archangel = new Camp();
		archangel.setCooldown(0);
		archangel.setStart(0);
		// Junk swarm host
		Camp junkSwarmHost = new Camp();
		junkSwarmHost.setCooldown(0);
		junkSwarmHost.setStart(0);
	}
}
