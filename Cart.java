
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered[qtyOrdered] = disc;
		System.out.println("The disc has been added!");
		if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
			System.out.println("The cart is almost full");
		}
		qtyOrdered++;
	}
	public void displayItemsOrdered() {
		for (int i = 0; i < qtyOrdered; ++i) {
			System.out.print(itemsOrdered[i].getTitle() + ", ");
		}
		System.out.println();
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty!");
		}
		else {
			int relocatePosition = 0;
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					relocatePosition = i;
					break;
				}
			}
			if (relocatePosition != qtyOrdered - 1) {
				for (int i = relocatePosition; i < qtyOrdered; i++) {
					itemsOrdered[i] = itemsOrdered[i + 1];
				}
			}
			qtyOrdered--;
			System.out.println("The disc is successfully removed!");
		}
	}
	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
}
