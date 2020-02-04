/*
 * Item class is an abstract class which will be inherited by Book and GiftCard class
 *  It contains id and price of Item. Id is autoincremented.
 */

package excercise;

public abstract class Item {
	private static int count = 0;				//static variable for auto increment id
	int id;						
	int price;
	
	public Item() {
		this.id=++count; 						// autoincrements whenever class called and assign a unique id to each item
	}
	
	public abstract void displayItem();			//abstract method to display item
}
