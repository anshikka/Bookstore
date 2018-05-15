//Inventory Class

//Bharath Senthil
//Ansh Sikka

import java.util.ArrayList;
public class Inventory{
	private ArrayList<Book> allBooks = new ArrayList<Book>();
        private String bookTitles;
        private String bookAuthors;
        private String bookPrices;
        private String bookCopies;
        private String ISBNs;

        
	public Inventory()
	{
            
		
	}
	//@param double price, int copies, String bookTitle, String Author, String isbnNumber
	public void addBooks(Book addedBook){
		allBooks.add(addedBook);
          
	}
	public boolean isAvailable(){
		for(Book myBook : allBooks){
			if(myBook.copiesLeft() == 0)
				return false;
				
		}
		return true;
	}
        public String populateTitle(){
            for (Book titleBooks : allBooks){
                bookTitles = titleBooks.getTitle() + "\n";
                return bookTitles;
            }
            return bookTitles;
        }
        public String populateAuthor(){
            for(Book authorBooks : allBooks){
                bookAuthors = authorBooks.getAuthor() + "\n";
                return bookAuthors;
            }
            return bookAuthors;
        }
        public String populatePrice(){
            for (Book pricedBooks : allBooks){
                bookPrices = String.valueOf(pricedBooks.getPrice()) + "\n";
               
            }
           return "$" + bookPrices;      
        }

    /**
     *
     * @return
     */
    public String populateCopies(){
            for (Book amtBooks : allBooks){
                bookCopies = String.valueOf(amtBooks.copiesLeft()) + "\n";
                return bookCopies;
            }
            return bookCopies;
        }
        public String populateISBN(){
            for (Book isbnNums : allBooks){
                ISBNs = isbnNums.getIsbn() + "\n";
                return ISBNs;
            }
            return ISBNs;
        }
        
        @SuppressWarnings("empty-statement")
        public Book getBookByTitle(String titleSearch) {
            for(Book titleBook : allBooks) {
                if (titleBook.getTitle().equals(titleSearch)) {
                    return titleBook;
                }
            }
            return null;
        }
        public Book getBookByISBN(String isbnSearch){
            for(Book isbnBookSearches : allBooks){
		if(isbnBookSearches.getIsbn().equals(isbnSearch)){
                        return isbnBookSearches;
                }
            }
            return null;
	}
        public Book getBookByAuthor(String authorSearch){
            for(Book authorBookSearches : allBooks){
                if(authorBookSearches.getAuthor().equals(authorSearch)){
                    return authorBookSearches;
                }
            }
            return null;
	}
        public void sort(){
            for(int i = 0; i < allBooks.size(); i++)
            {
		for(int k = 0; k < allBooks.size(); k++)
		{
                    if(((Book) allBooks.get(i)).getIsbn().compareTo(((Book) allBooks.get(k)).getIsbn()) < 1)
                    {
			Book temp = (Book) allBooks.get(k);
			allBooks.set(k, allBooks.get(i));
			allBooks.set(i, temp);
                    }
                    else if(((Book) allBooks.get(i)).getIsbn().compareTo(((Book) allBooks.get(k)).getIsbn()) > 1)
                    {
                        Book temp = (Book) allBooks.get(i);
                        allBooks.set(i, allBooks.get(k));
			allBooks.set(k, temp);
                    }
                }
            }
            }
        public ArrayList<Book> getBooks(){
            return allBooks;
        }
}

        
	 