package pkgLibrary;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import pkgMain.XMLReader;
import pkgMain.XMLXPath;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	
	XMLReader xml = new XMLReader();
	
	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	

	public Book getBook(String id) throws BookException{
		try {

			for(Book b : this.getBooks()) {
				if (b.getId().equals(id)) {
					return b;
				}
			}
			throw new BookException(id);
		} catch (BookException ex) {
			System.out.println(ex);

		}
		return new Book();
	}
	

	
	@XmlElement
	public void AddBook(int id, Book b) throws BookException {
		try{
			if(getBooks().contains(b)){
				throw new BookException(b);
			}
			else{ 
			ArrayList<Book> temp = getBooks();
			temp.add(b);
			setBooks(temp);
			}
		} catch(BookException e) {
			throw e;
		}
		books.add(b);
	}

//	System.out.println("Exception: The Book with Id: "+ id +" was not found in this catalog." );


	
	
	
	
}
