//Webbazon AB
//Project By: Ansh Sikka and Bharath Senthil

public class Book
{

private double myPrice;
private String myTitle;
private String bookAuthor;
private String isbn;
private int myCopies;	

	public Book(double price, int copies, String bookTitle, String Author, String isbnNumber)
	{
		myPrice = price;
		myCopies = copies;
		myTitle = bookTitle;
		bookAuthor = Author;
		isbn = isbnNumber;
		
	}
	public double getPrice()
	{
		return myPrice;
	}

	public String getIsbn()
	{
		return isbn;
	}
	public String getTitle()
	{
		return myTitle;
	}
	public String getAuthor()
	{
		return bookAuthor;
	}
	public int copiesLeft(){
		return myCopies;
	}
        public String notFound(){
            return "The book you searched for could not be found!";
        }
	public String toString()
	{
		return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nNumber of Available Books: " + copiesLeft() + "\nPrice: $" + getPrice(); 
	}
	
}













