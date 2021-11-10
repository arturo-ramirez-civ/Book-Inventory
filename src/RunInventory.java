/*File: RunInventory.java
* Author: Arturo Ramirez
* Updated: February 5, 2021
* Purpose: Host the main method for the program and
* provides the menu selection functionality.  
*/ 

import java.util.Scanner;

public class RunInventory {

	//Attribute 
	Inventory inv = new Inventory();
	    
    // Method to display menu
    public void displayMenu() {
        
        System.out.println("\n     Menu");
        System.out.println("1: Add book");
        System.out.println("2: Remove book");
        System.out.println("3: Find book");
        System.out.println("4: Display all books");
        System.out.println("9: Exit program");
    }//End of method
    
    // Method to handle user's selection
    public void processChoice( int c){
        
        switch(c) {
            
            case 1: inv.addBook();
                break;
            case 2: inv.removeBook();
                break;
            case 3: inv.findBook();
                break;
            case 4: inv.displayBook();
                break;
            case 9: System.out.println("\nThank you for using the program. Goodbye!");
                break;
            default: System.out.println("\nError. Please select from menu.");
         
        }//End of switch
        
    }//End of method
    
    // Main method
    public static void main(String[] args){
    	  
    	//new instance 
    	RunInventory run = new RunInventory();
    	
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        
        do {
            run.displayMenu();
            
            System.out.println("\nEnter your selection : ");
            selection = sc.nextInt();
            
            run.processChoice(selection);
        } while (selection != 9);
        
        sc.close();
        
    }// End of Main method
    
}//End of RunInventory Class
