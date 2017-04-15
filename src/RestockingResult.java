package OffSite;


	public class RestockingResult {
		//Item type item
		private Item item;

		//a constructor with an item type argument
		public RestockingResult(Item item) {
			this.item = item;
		}

		//Item type method to get item
		public Item getItem() {
			return item;
		}

	}
