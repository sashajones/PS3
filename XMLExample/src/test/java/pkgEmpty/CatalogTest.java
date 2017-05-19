package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.BookException;
import pkgLibrary.Catalog;

public class CatalogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddBook() throws BookException {
		Catalog c = new Catalog();
		c.setId(1);
		
		Book book1 = new Book();
		book1.setAuthor("Jones");
		book1.setDescription("Textbook");
		book1.setTitle("Intro to CISC");

		assertEquals(0, c.getBooks().size());
		c.AddBook(1, book1);
		assertEquals(1, c.getBooks().size());
	}
	
	@Test(expected=BookException.class)
	public void testAddBook2() throws BookException {
		Catalog c = new Catalog();
		c.setId(1);
		
		Book book1 = new Book();
		book1.setAuthor("Jones");
		book1.setDescription("Textbook");
		book1.setTitle("Intro to CISC");
		
		c.AddBook(1, book1);
		
		
	}
	
	@Test
	public void testGetBook() throws BookException {
		Catalog c = new Catalog();
		c.setId(1);
		
		Book book1 = new Book();
		book1.setAuthor("Jones");
		book1.setDescription("Textbook");
		book1.setTitle("Intro to CISC");
		book1.setId("1");

		c.AddBook(1, book1);
		c.getBook("1");
	}

}
