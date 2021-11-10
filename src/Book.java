/*File: Book.java
* Author: Arturo Ramirez
* Updated: February 5, 2021
* Purpose: Create a book object
*/

public class Book {
     
    // Attributes 
    private int id;
    private double price;
    private String title;
    
    //constructor 
    public Book (int id, double price, String title) {
        
        //Assigned user input to attributes
        this.id = id;
        this.price = price;
        this.title = title;    
    }
    
    //Get methods
    public int getId(){
        return id;
    }
     
    public double getPrice(){
        return price;
    }
    
    public String getTitle(){
        return title;
    }
    
    //Set methods
    public void setId(int id){
        this.id = id;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String toString() {
    	return "\nBook Id = " + id + "\nBook Price = " + price + "\nBook Title = " + title;
    }
      
}// End of class

