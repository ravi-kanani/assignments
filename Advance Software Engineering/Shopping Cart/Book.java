/*
 * Book class is inherited from Item class 
 * It contains author and title of the book and implementation of displayItem() method.
 */

package excercise;

public class Book extends Item {									//inherits Item class
	private String author;
	private String title;
	
	public Book(String title, String author, int price) {				// constructor which will set data on new object creation
		setTitle(title);
		setAuthor(author);
		setPrice(Math.abs(price));
	}
	
	/* 
	 * getters and setters for author, title and price
	 */
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * this method prints details of the single added book in shopping cart
	 *
	 */	
	public void displayItem() {
		System.out.println("Type: Book | ID: "+id+" | Title: " + getTitle() + " | Author:" + getAuthor() + " | Price: $" + getPrice());
	}
}
