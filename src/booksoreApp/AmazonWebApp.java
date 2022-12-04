package booksoreApp;

public class AmazonWebApp {
	/**
	 * Start point for app
	 * @author ronan
	 * @param args
	 */
	public static void main(String[] args) {
	// create a book
	AmazonBook book1 = new AmazonBook();
	book1.setAuthor("Bill Bryson");
	book1.setCustomerRank(4);
	book1.setISBN10("0857522418");
	book1.setLanguage("English");
	book1.setPages(464);
	book1.setPrice(14.55);
	book1.setTitle("The Body: A Guide for Occupants");
	System.out.println(book1.toString());
	// create another book - using constructor with args
	AmazonBook book2 = new AmazonBook("Ulysses", "James Joyce", 2.25, 736, 
	"English", "1840226358", 5);
	System.out.println(book2.toString());
	// which book has the most pages ?
	longestRead(book1, book2);
	}
	/**
	 * Outputs the book title (to screen) with the most pages 
	 * @param b1 - Amazon book
	 * @param b2 - Amazon book
	 */
	public static void longestRead(AmazonBook b1, AmazonBook b2) {
	if (b1.getPages() > b2.getPages()) {
	System.out.println("Longest read is : " + b1.getTitle());
	} else if (b2.getPages() > b1.getPages()) {
	System.out.println("Longest read is : " + b2.getTitle());
	} else {
	System.out.println("Both books are the same length");
	}
	}
	}