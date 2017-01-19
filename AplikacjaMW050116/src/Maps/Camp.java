package Maps;

public class Camp {
	double cooldown;
	double start;
	public Camp(){
		cooldown = 0;
		start = 0;
	}
	public void setCooldown(double cd){cooldown = cd;}
	public double getCooldown(){return cooldown;}
	public void setStart(double s){start = s;}
	public double getStart(){return start;}
}
