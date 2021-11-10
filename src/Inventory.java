/*File: Inventory.java
* Author: Arturo Ramirez
* Updated: February 5, 2021
* Purpose: Create an arraylist to store book objects
* and performs add, remove, find, and display functions.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	
	//Attribute - creates a array list 
	private ArrayList<Book> bookList; 
	
	//constructor
	public Inventory () {
		this.bookList = new ArrayList<>();
	}
	
    //Method to add book
    public void addBook() {
    	//Reads input
    	Scanner sc = new Scanner(System.in);
    	
    	//stores int in id attribute
    	System.out.println("What is the book id (integer value)? ");
    	int id = sc.nextInt();
    	
    	//stores double in price attribute 
    	System.out.println("what is the book price (double value)? ");
    	double price = sc.nextDouble();
    	
    	//stores string in title attribute
    	System.out.println("What is the book title? ");
    	String title = sc.next();
    	//gets the remaining of the string input
    	title = title + sc.nextLine();
    	 
    	//create book object
    	Book a = new Book (id, price, title);
    	
    	//adds and tells user book was created
    	this.bookList.add(a);
    	System.out.println("\nThe following book was added: " + a.toString());		
    }
    
    
	public void removeBook() {
    	
		//Reads input
    	Scanner sc = new Scanner(System.in);
    	
    	//asks for book id 
    	System.out.println("What is the book id (integer value)? ");
    	int id = sc.nextInt();
    	
    	//size set to the arraylist size
    	int size = this.bookList.size();
    	
    	for (int i=0; i<size; i++) {
    		Book a = this.bookList.get(i);
    		
    		if (a.getId() == id) {
    			//removes the book and tells the user the book was removed
    			this.bookList.remove(i);
    			System.out.println("\nThe following book was removed: "+ a.toString());
    			return;
    		}//end of if loop
    	}//end of For loop
   
    	System.out.println("\nBook id does not exist");
	}
	
	
	public void findBook() {
		
		//Reads input
    	Scanner sc = new Scanner(System.in);
    	
    	//asks for book id 
    	System.out.println("What is the book id (integer value)? ");
    	int id = sc.nextInt();
    	
    	//size set to the arraylist size 
    	int size = this.bookList.size();
    	
    	for (int i=0; i<size; i++) {
    		//gets book object in each index
    		Book a = this.bookList.get(i);
    		
    		//determines in the input already exist in the arraylist
    		if (a.getId() == id) {
    			System.out.println("\nThe following book id was found: "+ a.toString());
    			return;
    		}//end of if loop
    	}//end of For loop
   
    	System.out.println("\nBook id does not exist");
	}	
	
	public void displayBook() {
		
		if (this.bookList.size()==0) {
			System.out.println("\nThere are no books to display");
		} else {
			System.out.println("The following books are available:");
			//Loops for all books in arraylist and prints all books
			for (int i=0; i<this.bookList.size(); i++) {
				Book a = this.bookList.get(i);
				System.out.println(a.toString());
			}
		}

	}

}//End of Inventory Class