/**
* ShoppingCart project in which user can add item (Book, Gift Card),
* see all items and and also remove it from the cart.
*
* @author  Ravi Kanani
* @version 1.0
* @since   2019-01-15
*/

package excercise;
import java.util.Scanner;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		ShoppingCart cart=new ShoppingCart();       // shoppingcart instantiation
		
		int choice;
		do {
			/*
			 * display a menu until user press 4 for exit
			 */
			System.out.println("1. Display all items");
			System.out.println("2. Add an item");
			System.out.println("3. Remove an item");
			System.out.println("4. Exit");
			System.out.print("Please select 1, 2, 3 or 4: ");		//user will enter 1,2,3 or 4
			choice=Integer.parseInt(scan.nextLine());
			System.out.println("<---------------------------------------------------------------------------->");
			switch(choice) {
			case 1:								// displays items in the shopping cart
				cart.displayItems();
				break;
				
			case 2:								// add item book or gift card
				System.out.println("<-------------------- Add an item -------------------->");
				System.out.println("Which item you want to add? book or gift card");
				System.out.println("1. Book");
				System.out.println("2. Gift Card");
				System.out.print("Enter: ");
				int select=Integer.parseInt(scan.nextLine());
				switch(select) {
				case 1:																// take input from user for book and add it to the cart
					System.out.print("Enter title of the book: ");
					String title=scan.nextLine();
					
					System.out.print("Enter name of the author: ");
					String author=scan.nextLine();
					
					System.out.print("Enter price of the book: $");
					int bookPrice=Integer.parseInt(scan.nextLine());
					
					Item addedBook=cart.addItem(new Book(title,author,bookPrice)); 		// adding book to the cart
					System.out.print("Following book is added successfully -->");
					addedBook.displayItem();										// notify user that this book is added.
					break;
				case 2:																	// get data from the user of gift card and add to the cart
					System.out.print("Enter description of the gift card: ");
					String description=scan.nextLine();
					System.out.print("Enter colour of the gift card: ");
					String colour=scan.nextLine();
					System.out.print("Enter price of the gift card: $");
					int cardPrice=Integer.parseInt(scan.nextLine());
					Item addedGC=cart.addItem(new GiftCard(description,colour,cardPrice));		// adding gift card to the cart
					System.out.println("Following gift card is added successfully -->");
					addedGC.displayItem();												// notify user about added gift card
					break;
				default:													// for all other choices other than 1 and 2
					System.out.println("Invalid choice.");
				}
				break;
			
			case 3:														// display all items and ask user to which item to delete 
				if(cart.isEmpty()) {									// check if cart is empty
					System.out.println("No items available.");
				}else {
					System.out.println("Which item you want to remove?");
					cart.displayItems();								// displaying all items
					System.out.print("Enter: ");
					int itemNumber=Integer.parseInt(scan.nextLine());
					Item removedItem=cart.removeItem(cart.getItems().get(itemNumber-1));		// remove item from the cart
					System.out.println("Following item is removed successfully --> ");
					removedItem.displayItem();													// notify user which item is removed.
				}
				break;
				
			case 4:
				System.out.println("Good Bye.");							// Exit
				break;
				
			default:														// default case for all other choices
				System.out.println("Invalid choice");
			}
			System.out.println("<---------------------------------------------------------------------------->");
		}while(choice!=4);
		
		scan.close();														// close the Scanner class
	}
}
