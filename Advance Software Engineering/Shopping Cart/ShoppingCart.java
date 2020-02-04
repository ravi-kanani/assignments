/**
 * ShoppingCart class will maintain list of Items which will be added in the shopping cart
 * It will also maintain total of the cart
 */

package excercise;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> items;			//store list of Items of shopping cart
	private int total=0;
	
	public ShoppingCart() {
		this.items=new ArrayList<Item>();
	}
	
	public ArrayList<Item> getItems(){			// returns all items array
		return items;
	}
	
	/*
	 * if cart is empty, it will return true else false
	 */
	public boolean isEmpty() {
		return items.size()==0?true:false;
	}
	
	/*
	 * This method adds an Item to items list
	 * @param item is parameter of Item type.
	 * @return added item will be returned
	 */
	public Item addItem(Item item) {
		this.items.add(item);
		total+=item.price;
		return item;
	}
	
	/*
	 * This method will remove an Item from items list
	 * @param item is parameter of Item type
	 * @return removed item will be returned
	 */
	public Item removeItem(Item item) {
		this.items.remove(item);
		total-=item.price;
		return item;
	}
	
	/*
	 * This method will list all items in the cart with total price of it if it's not empty
	 */
	public void displayItems() {
		if (isEmpty()) {
			System.out.println("No Items. Please add one.");
		}
		else {
			items.sort((o1, o2) -> o1.price - o2.price);				//sorting items list according to price
			System.out.println("Total price: $" + total);
			for(int i=0;i<items.size();i++) {
				System.out.print((i+1)+". ");
				items.get(i).displayItem();
			}
		}
	}
}
