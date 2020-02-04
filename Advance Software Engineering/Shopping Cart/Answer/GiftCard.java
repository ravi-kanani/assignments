/*
 * GiftCard is inherited from the Item class 
 * It contains description and colour of the Giftcard
 */

package excercise;

public class GiftCard extends Item{									//inherits Item class
	private String description;
	private String colour;
	
	public GiftCard(String description, String colour, int price) {		// constructor which will set data on new object creation
		setDescription(description);
		setColour(colour);
		setPrice(Math.abs(price));									// no negative price allowed
	}
	
	/* 
	 * getters and setters for description, colour and price
	 */
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * this method prints details of the added giftcard in shopping cart
	 * @return void will print giftcard info
	 */
	public void displayItem() {
		System.out.println("Type: Gift Card | ID: " + id + " | Description: " + getDescription() + " | Colour:" + getColour() + " | Price: $" + getPrice());
	}
}
