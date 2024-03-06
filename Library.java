package TASK_3;
//Question 1
import java.util.Arrays;

public class Library  {

	public  Book books[];
	//Constructor
	Library()
	{
		
		 this.books = new Book[3];
		 
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	//Add MEthod
	public void addBook(Book b1,Book b2,Book b3)
	{
				books[0]  =b1;
				books[1] = b2;
				books[2] =b3;
				System.out.println("Books added successfully");
			
		
	}


	//This is the remove method where are able to set the value to 0 
	// with ArrayList this remove method would more efficient
	public void removeBook(int ID)
	{
		for(int  i = 0;i<books.length;i++)
		{
			if(books[i].getBookID() == ID)
			{
				books[i] = null;
				System.out.println("Book removed Successfully");
				return;
			}
		}
		
	}
	// SEarch MEthod
	public void searchBook(int bookID)
	{
		
		for(int i = 0;i<books.length;i++)
		{
			if(books[i] != null && books[i].getBookID() == bookID)
			{
				System.out.println("Available");
				return;
		    }
	
		}
		System.out.println("Not Available");
	}
	//Display MEthod
	public void displayBooks()
	{
		
		for(Book b : books)
		{
			if(b!= null)
			{
				System.out.println("Book ID:" +b.getBookID()+" "+"Title:"+b.getTitle() +" "+ "AuthorName:"+b.getAuthorName());
			}
		}
	}

}
