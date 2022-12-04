package booksoreApp;


/**
	 * Represents the required fields from a book listed on Amazon
	 * @author ronan
	 *
	 */
public class AmazonBook {

	

	// instance vars
	
	// title of the book
	private String title;
	
	// author of the book
	private String author;
	
	// current price of the book on Amazon
	private double price;
	
	// number of pages in the book - i.e. book length
	private int pages;
	
	// language which this instance of the book is written in 
	private String language;
	
	// ISBN of this book
	private String ISBN10;
	
	// current customer rating as per Amazon customers
	private int customerRank;
	
	
	/**
	 * Default constructor - creates an instance of a book (AmazonBook) with default values
	 */
	
	public AmazonBook(){
	}
	/**
	 * Constructor with args creates a book with all details
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param pages
	 * @param language
	 * @param iSBN10
	 * @param customerRank
	 */
	public AmazonBook(String title, String author, double price, int pages, 
	String language, String iSBN10, int customerRank) {
	this.title = title;
	this.author = author;
	this.price = price;
	this.pages = pages;
	this.language = language;
	this.ISBN10 = iSBN10;
	this.customerRank = customerRank;
	}
	// methods
	/**
	 * @return the title
	 */
	public String getTitle() {
	return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
	this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
	return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
	this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
	return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
	this.price = price;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
	return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
	this.pages = pages;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
	return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
	this.language = language;
	}
	/**
	 * @return the iSBN10
	 */
	public String getISBN10() {
	return ISBN10;
	}
	/**
	 * @param iSBN10 the iSBN10 to set
	 */
	public void setISBN10(String iSBN10) {
	this.ISBN10 = iSBN10;
	}
	/**
	 * @return the customerRank
	 */
	public int getCustomerRank() {
	return customerRank;
	}
	/**
	 * @param customerRank the customerRank to set
	 */
	public void setCustomerRank(int customerRank) {
	this.customerRank = customerRank;
	}
	/**
	 * This is an generated method (using Source - Generate toString() in 
	Eclipse)
	 */
	@Override
	public String toString() {
	return "AmazonBook [title=" + title + ", author=" + author + ", price="
	+ price + ", pages=" + pages
	+ ", language=" + language + ", ISBN10=" + ISBN10 + ", customerRank=" + customerRank + "]";
	}
	}
	

