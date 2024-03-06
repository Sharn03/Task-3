package TASK_3;
//Question 1


public class BookManagementSystem {
public static void main(String[] args) {
	//first we have to initialize the book object that we gonna add it in the array
	//In-order to Access display method which is of class Library that y we need to create Library class
	Library library = new Library();
	// Creating and Initializing the object of the Book class 
	Book b1 = new Book(1,"Varanamaayiram","Gautam",true);
	Book b2 = new Book(2,"Prison Break ","John",true);
	Book b3 = new Book(3,"GoT","Kevin",true);
	// In-order to access Library class methods we have create Objects of Library class 
	library.addBook(b1,b2,b3);
	library.displayBooks();
	
	// this is to access Remove Method
	library.removeBook(1);
	System.out.println("After Removing the Book Details of b1");
	library.displayBooks();
	
	// This is to access SearchBook method
	library.searchBook(2);
	
	}
}
//OUTPUT//
/*
  "Add MEthod is CAlled"
  Books added successfully
 
"Display MEthod is Called"
Book ID:1 Title:Varanamaayiram AuthorName:Gautam
Book ID:2 Title:Prison Break  AuthorName:John
Book ID:3 Title:GoT AuthorName:Kevin

"Once REmove MEthod is called"

Book removed Successfully
Book ID:2 Title:Prison Break  AuthorName:John
Book ID:3 Title:GoT AuthorName:Kevin

"Search method is called"
Available
 */
