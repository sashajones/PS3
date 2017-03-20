package pkgLibrary;

public class BookException extends Exception {

	private String id;
	private Book b;
	
	public BookException(String id) {
		super("The book with id: " + id + " was not found in this Catalog.");
		this.id = id;
		b = new Book(id);
	}
	
	public BookException(Book b) {
		super();
		this.b = b;
	}
	
	public String getId() {
		return id;
	}

	/**
	 * @return the b
	 */
	public Book getB() {
		return b;
	}


	
	
}
