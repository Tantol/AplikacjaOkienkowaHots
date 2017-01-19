package Characters;

public class Champion {
	public Abilitie skillQ, skillW, skillE;
	public Abilitie passiveD;
	public Abilitie heroSkill1;
	public Abilitie heroSkill2;
	public String name;
	public String role; // "Warrior", "Assasin", "Support", "Specialist"
	public String universe; // "Warcraft", "StarCraft", "Diablo", "Retro", "Overwatch"
	public String info;
	public double defaultHp;
	public double defaultAaDmg;
	public double skallingHpPerLvl;
	public double skallingAaDmgPerLvl;
	public boolean aAIsRange;
	
	
	public Champion(String name){
		this.name=name;
		this.role="";
		this.universe="";
		this.info="";
		this.defaultHp=0;
		this.defaultAaDmg=0;
		this.skallingHpPerLvl=0;
		this.skallingAaDmgPerLvl=0;
		aAIsRange=false;
	}
	//Set for skills
	public void skillQ(String name){this.skillQ(name);}
	public void skillW(String name){this.skillW(name);}
	public void skillE(String name){this.skillE(name);}
	public void passiveD(String name){this.passiveD(name);}
	public void heroSkill1(String name){this.heroSkill1(name);}	
	public void heroSkill2(String name){heroSkill2(name);}
	
	//Set
	public void name(String name){this.name=name;}
	public void role(String role){this.role=role;}
	public void universe(String universe){this.universe=universe;}
	public void info(String info){this.info=info;}
	public void defaultHp(double defaultHp){this.defaultHp=defaultHp;}
	public void defaultAaDmg(double defaultAaDmg){this.defaultAaDmg=defaultAaDmg;}
	public void skallingHpPerLvl(double skallingHpPerLvl){this.skallingHpPerLvl=skallingHpPerLvl;}
	public void skallingAaDmgPerLvl(double skallingAaDmgPerLvl){this.skallingAaDmgPerLvl=skallingAaDmgPerLvl;}
	public void aAIsRange(boolean aAIsRange){this.aAIsRange=aAIsRange;}
	
	//Get
	public String name(){return name;}
	public String role(){return role;}
	public String universe(){return universe;}
	public String info(){return info;}
	public double defaultHp(){return defaultHp;}
	public double defaultAaDmg(){return defaultAaDmg;}
	public double skallingHpPerLvl(){return skallingHpPerLvl;}
	public double skallingAaDmgPerLvl(){return skallingAaDmgPerLvl;}
	public boolean aAIsRange(){return aAIsRange;}

}
