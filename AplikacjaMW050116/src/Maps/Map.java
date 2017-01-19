package Maps;

import java.awt.List;

public class Map {
	String name;
	int lanes;
	int forts;
	int keeps;
	int keepHP;
	int towers;
	int towerHP;
	int gates;
	int gateHP;
	int fountains;
	int fountainHP;
	int coreHP;
	int coreShieldHP;
	public Map(){
		name = "NoName";
		lanes = 0;
		forts = 0;
		keeps = 0;
		keepHP = 0;
		towers = 0;
		towerHP = 0;
		gates = 0;
		gateHP = 0;
		fountains = 0;
		fountainHP = 0;
		coreHP = 0;
		coreShieldHP = 0;
		
	}
	
	public void setName(String n){name = n;}
	public String getName(){return name;}
	public void setLanes(int l){lanes = l;}
	public int getLanes(){return lanes;}
	public void setForts(int f){forts = f;}
	public int getForts(){return forts;}
	public void setKeeps(int k){keeps = k;}
	public int getKeeps(){return keeps;} 
	public void setKeepHP(int hp){keepHP=hp;}
	public int getKeepHP(){return keepHP;}
	public void setTowers(int t){towers = t;}
	public int getTowers(){return towers;}
	public void setTowerHP(int hp){towerHP = hp;}
	public int getTowersHP(){return towerHP;}
	public void setGates(int g){gates = g;}
	public int getGates(){return gates;}
	public void setGateHP(int hp){gateHP = hp;}
	public int getGateHP(){return gateHP;}
	public void setFountains(int f){fountains = f;}
	public int getFountains(){return fountains;}
	public void setFountainHP(int hp){fountainHP = hp;}
	public int getFountainsHP(){return fountainHP;}
	public void setCoreHP(int hp){coreHP = hp;}
	public int getCoreHP(){return coreHP;}
	public void setCoreShieldHP(int hp){coreShieldHP = hp;}
	public int getCoreShieldHP(){return coreShieldHP;}
	
	
}
