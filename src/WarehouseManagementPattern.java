package OffSite;


import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;


public class WarehouseManagementPattern {

	//Hashmap that takes two types (String and Item) called items
	private HashMap<String, Item> items;
	
	//Hashmap that takes two types (String and Location) called items
	private HashMap<String, Location> locations;
	
	//iterate all the items in the warehouse
	private Collection c = items.values();
	Iterator itr = c.iterator();

	//a constructor that initiates two hashmaps
	public WarehouseManagementPattern() {
		this.items = new HashMap<>();
		this.locations = new HashMap<>();
	}

	//this new item gets inserted into the item including its name and item itself
	public WarehouseManagementPattern IncrementItem(Item item) {
		items.put(item.getName(), item);
		return this;
	}

	//similar to above but this time new location will be inserted
	public WarehouseManagementPattern IncrementLocation(Location location) {
		locations.put(location.getName(), location);
		return this;
	}

	public HashMap<String, Item> getItems() {
		return this.items;
	}

	public HashMap<String, Location> getLocations() {
		return this.locations;
	}

	//print out all the stored items in the item list
	public void viewAllItems(String name) {
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	  /**
	    * Deduct 'amountToPick' of the given 'productId' from inventory.
	    * @param productId The ID of the product to pick
	    * @param amountToPick The quantity of the product to pick
	    * @return TODO: to be implemented
	    */
	public PickingResult pickResult(String location, int amount) {
		Item item = items.get(locations);
		item.decrementAmount(amount);

		PickingResult pickingResult = new PickingResult(item);
		return pickingResult;
	}

	 /**
	    * Add 'amountToRestock' of the given productId to inventory.
	    * @param productId The ID of the product to restock
	    * @param amountToRestock The quantity of the product to restock
	    * @return TODO: to be implemented
	    */
	
	public RestockingResult restockResult(String location, int amount) {
		Item item = items.get(locations);
		item.incrementAmount(amount);

		RestockingResult restockingResult = new RestockingResult(item);
		return restockingResult;
	}
	
	//check if the given name of an item exists or not
	//if it is, print out its information
	public void checkingProduct(String name) {
		Item item = items.get(name);
		System.out.println(item.getName() + "\n"+item.getLocation().getName());
	}


}
