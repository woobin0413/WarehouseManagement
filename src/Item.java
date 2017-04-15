package OffSite;

public class Item {

	// 3 variables; name, level, location
	private String name;
	private int level;
	private Location location;

	// A constructor that takes 3 arguments
	public Item(String name, int level, Location location) {
		this.name = name;
		this.level = level;
		this.location = location;
	}

	//remove amount of items
	public void decrementAmount(int amount) {
		this.level -= amount;
	}

	//add amount of items
	public void incrementAmount(int amount) {
		this.level += amount;
	}

	//getter for those 3 variables
	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}
	
	public Location getLocation(){
        return this.location;
    }

}
