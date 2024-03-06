package TASK_3;
//Question 1
//This is Parent Class 
public class Book {
	// These are Data members of parent class
	public static Book[] books;
	private int bookID;
	private String title;
	private String authorName;
	private boolean isAvailable;
	
	
	public Book(int bookID, String title, String authorName, boolean isAvailable) {
		
		this.bookID = bookID;
		this.title = title;
		this.authorName = authorName;
		this.isAvailable = isAvailable;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
